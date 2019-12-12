package com.jain.schl.sclmngmnt.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jain.schl.sclmngmnt.model.StdDetailsInfo;
import com.jain.schl.sclmngmnt.repo.StdDetailsInfoRepo;
import com.jain.schl.sclmngmnt.service.StdDetailsInfoService;

@Service
public class StdDetailsInfoServiceImp implements StdDetailsInfoService {
	@Autowired
	private StdDetailsInfoRepo stdDetailsInfoRepo;
	
	
	public StdDetailsInfo addStudentDetails(StdDetailsInfo stdDetailsInfo){
		return stdDetailsInfoRepo.save(stdDetailsInfo);
	}
	public StdDetailsInfo findByStdId(String stdId){
		return stdDetailsInfoRepo.findByStdId(stdId);
	}

}
