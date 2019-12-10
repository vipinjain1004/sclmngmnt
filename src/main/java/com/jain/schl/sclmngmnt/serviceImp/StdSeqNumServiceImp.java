package com.jain.schl.sclmngmnt.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jain.schl.sclmngmnt.model.StdSeqNum;
import com.jain.schl.sclmngmnt.repo.StdSeqNumRepo;
import com.jain.schl.sclmngmnt.service.StdSeqNumService;

@Service
public class StdSeqNumServiceImp implements StdSeqNumService {
	@Autowired
	private StdSeqNumRepo stdSeqNumRepo;
	public StdSeqNum addSequenceNum(StdSeqNum stdSeqNum){
		return stdSeqNumRepo.save(stdSeqNum);
	}
}
