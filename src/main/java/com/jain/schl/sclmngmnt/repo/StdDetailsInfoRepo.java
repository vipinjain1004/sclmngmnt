package com.jain.schl.sclmngmnt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jain.schl.sclmngmnt.model.StdDetailsInfo;

@Repository
public interface StdDetailsInfoRepo extends JpaRepository<StdDetailsInfo, Long> {
	
	public StdDetailsInfo findByStdId(String stdId);
}
