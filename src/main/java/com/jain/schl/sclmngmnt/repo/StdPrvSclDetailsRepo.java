package com.jain.schl.sclmngmnt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jain.schl.sclmngmnt.model.StdPrvSclDetails;

@Repository
public interface StdPrvSclDetailsRepo extends JpaRepository<StdPrvSclDetails, Long>{

}
