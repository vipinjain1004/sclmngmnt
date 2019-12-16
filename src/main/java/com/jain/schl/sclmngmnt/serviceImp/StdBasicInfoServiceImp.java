package com.jain.schl.sclmngmnt.serviceImp;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jain.schl.sclmngmnt.exception.StudentNotFoundException;
import com.jain.schl.sclmngmnt.model.StdBasicInfo;
import com.jain.schl.sclmngmnt.model.StdClassDetails;
import com.jain.schl.sclmngmnt.model.StdDetailsInfo;
import com.jain.schl.sclmngmnt.model.StdPrvSclDetails;
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

	public StdBasicInfo addStudent(StdBasicInfo studentBasicInfo) {
		StdSeqNum stdSeqNum = new StdSeqNum(new java.sql.Date(new Date().getTime()));
		stdSeqNum = seqNumRepo.save(stdSeqNum);
		studentBasicInfo.setStdId(
				StdConstants.STD_ID_PRFIX + String.format(StdConstants.STD_ID_FORMATE, stdSeqNum.getEntSeqNum()));		
		StdDetailsInfo stdDetailsInfo = new StdDetailsInfo(studentBasicInfo.getStdId());
		studentBasicInfo.setStdDetailsInfo(stdDetailsInfo);
		StdClassDetails stdClassDetails = new  StdClassDetails(studentBasicInfo.getStdId());
		StdPrvSclDetails stdPrvSclDetails = new StdPrvSclDetails(studentBasicInfo.getStdId());
		studentBasicInfo.setStdPrvSclDetails(stdPrvSclDetails);
		stdClassDetails.setStartDate(new Date());
		Set<StdClassDetails> set = new HashSet<>();
		set.add(stdClassDetails);
		studentBasicInfo.setStdClassDetails(set);
		studentBasicInfo = stdStudentAddUpdateRepo.save(studentBasicInfo);		
		return studentBasicInfo;
	}

	public StdBasicInfo updateStudent(StdBasicInfo studentInfo) {
		studentInfo = stdStudentAddUpdateRepo.save(studentInfo);	
		return studentInfo;
	}

	public Optional<StdBasicInfo> getStudentById(String stdId) throws StudentNotFoundException {
		Optional<StdBasicInfo> stdBasicInfo =  stdStudentAddUpdateRepo.getStudentById(stdId);
		if(!stdBasicInfo.isPresent())
			throw new StudentNotFoundException("Student Not Found for " + stdId);
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
	
	public List<StdBasicInfo> findAll() throws StudentNotFoundException{
		List<StdBasicInfo> list =  stdStudentAddUpdateRepo.findAll();
		if(list.isEmpty())
			throw new StudentNotFoundException("Student not found");
		return list;
	}
}
