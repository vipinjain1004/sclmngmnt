package com.jain.schl.sclmngmnt.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jain.schl.sclmngmnt.model.StdBasicInfo;


@Repository
public interface StdStudentAddUpdateRepo extends JpaRepository<StdBasicInfo, Long> {

	@Query(value = "SELECT t FROM StdBasicInfo t WHERE t.stdId = ?1", nativeQuery=false)
	public Optional<StdBasicInfo> getStudentById(String stdId);
	
	public List<StdBasicInfo> findByStdFstName(String name);
	
}

//value="select e from Employee e where empName = ?1 limit 1", nativeQuery=true