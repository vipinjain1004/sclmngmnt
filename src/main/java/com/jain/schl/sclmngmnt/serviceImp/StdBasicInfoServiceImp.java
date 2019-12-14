package com.jain.schl.sclmngmnt.serviceImp;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jain.schl.sclmngmnt.exception.StudentNotFoundException;
import com.jain.schl.sclmngmnt.model.StdBasicInfo;
import com.jain.schl.sclmngmnt.model.StdDetailsInfo;
import com.jain.schl.sclmngmnt.model.StdSeqNum;
import com.jain.schl.sclmngmnt.repo.StdSeqNumRepo;
import com.jain.schl.sclmngmnt.repo.StdStudentAddUpdateRepo;
import com.jain.schl.sclmngmnt.service.StdBasicInfoService;
import com.jain.schl.sclmngmnt.utils.StdConstants;

@Service
public class StdBasicInfoServiceImp implements StdBasicInfoService {
	@Autowired
	private StdStudentAddUpdateRepo stdStudentAddUpdateRepo;
	@Autowired
	private StdSeqNumRepo seqNumRepo;

	public StdBasicInfo addStudent(StdBasicInfo studentInfo) {
		StdSeqNum stdSeqNum = new StdSeqNum(new java.sql.Date(new Date().getTime()));
		stdSeqNum = seqNumRepo.save(stdSeqNum);
		studentInfo.setStdId(
				StdConstants.STD_ID_PRFIX + String.format(StdConstants.STD_ID_FORMATE, stdSeqNum.getEntSeqNum()));
		
		StdDetailsInfo stdDetailsInfo = new StdDetailsInfo(studentInfo.getStdId());
		studentInfo.setStdDetailsInfo(stdDetailsInfo);
		//stdDetailsInfo.setStdBasicInfo(studentInfo);
		
		studentInfo = stdStudentAddUpdateRepo.save(studentInfo);		
		//stdDetailsInfoServiceImp.addStudentDetails(stdDetailsInfo);		
		return studentInfo;
	}

	public StdBasicInfo updateStudent(StdBasicInfo studentInfo) {
		studentInfo = stdStudentAddUpdateRepo.save(studentInfo);	
		return studentInfo;
	}

	public Optional<StdBasicInfo> getStudentById(String stdId) throws StudentNotFoundException {
		Optional<StdBasicInfo> stdBasicInfo =  stdStudentAddUpdateRepo.getStudentById(stdId);
		if(!stdBasicInfo.isPresent())
			throw new StudentNotFoundException("Student Not Found for "+stdId);
		return stdBasicInfo;
	}

	public List<StdBasicInfo> getStudentByName(String name) throws StudentNotFoundException  {
		List<StdBasicInfo> list = stdStudentAddUpdateRepo.findByStdFstName(name);
		if(list.isEmpty())
			throw new StudentNotFoundException("Student Not Found for "+name);
		return list;
	}
	public List<StdBasicInfo> findByStdFstNameAndLstName(String name,String LstName) throws StudentNotFoundException {
		List<StdBasicInfo> list = stdStudentAddUpdateRepo.findByStdFstNameAndStdLstName(name, LstName);
		if(list.isEmpty())
			throw new StudentNotFoundException("Student Not Found for "+name);
		return list;
	}
	
}
