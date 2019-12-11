package com.jain.schl.sclmngmnt.serviceImp;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jain.schl.sclmngmnt.model.StdSeqNum;
import com.jain.schl.sclmngmnt.model.StudentInfo;
import com.jain.schl.sclmngmnt.repo.StdSeqNumRepo;
import com.jain.schl.sclmngmnt.repo.StdStudentAddUpdateRepo;
import com.jain.schl.sclmngmnt.service.StdStudentAddUpdateService;
import com.jain.schl.sclmngmnt.utils.StdConstants;

@Service
public class StdStudentAddUpdateServiceImp implements StdStudentAddUpdateService {
	@Autowired
	private StdStudentAddUpdateRepo stdStudentAddUpdateRepo;
	@Autowired
	private StdSeqNumRepo seqNumRepo;

	public StudentInfo addStudent(StudentInfo studentInfo) {
		StdSeqNum stdSeqNum = new StdSeqNum(new java.sql.Date(new Date().getTime()));
		stdSeqNum = seqNumRepo.save(stdSeqNum);
		studentInfo.setStdid(
				StdConstants.STD_ID_PRFIX + String.format(StdConstants.STD_ID_FORMATE, stdSeqNum.getEntSeqNum()));
		stdStudentAddUpdateRepo.save(studentInfo);
		return studentInfo;
	}

	public StudentInfo updateStudent(StudentInfo studentInfo) {
		return studentInfo;
	}

	public Optional<StudentInfo> getStudentById(String stdId) {
		return stdStudentAddUpdateRepo.getStudentById(stdId);
	}

	public List<StudentInfo> getStudentByName(String name) {

		return stdStudentAddUpdateRepo.findByStdFstName(name);
	}
}
