package com.jain.schl.sclmngmnt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jain.schl.sclmngmnt.model.StdSeqNum;

@Repository
public interface StdSeqNumRepo  extends JpaRepository<StdSeqNum, Long> {

}
