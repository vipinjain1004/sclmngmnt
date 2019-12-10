package com.jain.schl.sclmngmnt.serviceImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.jain.schl.sclmngmnt.model.StudentInfo;
import com.jain.schl.sclmngmnt.repo.StdStudentAddUpdateRepo;
import com.jain.schl.sclmngmnt.service.StdStudentAddUpdateService;

import org.springframework.stereotype.Service;
@Service
public class StdStudentAddUpdateServiceImp implements StdStudentAddUpdateService {
	@Autowired
	private StdStudentAddUpdateRepo stdStudentAddUpdateRepo;
	public StudentInfo addStudent(StudentInfo studentInfo){
		stdStudentAddUpdateRepo.save(studentInfo);
		return studentInfo;
	}
	public StudentInfo updateStudent(StudentInfo studentInfo){
		return studentInfo;		
	}
	
	public Optional<StudentInfo> getStudentById(String stdId){
		return stdStudentAddUpdateRepo.getStudentById(stdId);
	}

}
