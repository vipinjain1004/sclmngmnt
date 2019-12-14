package com.jain.schl.sclmngmnt.service;

import java.util.List;
import java.util.Optional;

import com.jain.schl.sclmngmnt.exception.StudentNotFoundException;
import com.jain.schl.sclmngmnt.model.StdBasicInfo;

public interface StdBasicInfoService {
	public StdBasicInfo addStudent(StdBasicInfo studentInfo);
	public StdBasicInfo updateStudent(StdBasicInfo studentInfo);
	public Optional<StdBasicInfo> getStudentById(String stdId) throws StudentNotFoundException ;
	public List<StdBasicInfo> getStudentByName(String name) throws StudentNotFoundException ;
	public List<StdBasicInfo> findByStdFstNameAndLstName(String name,String LstName) throws StudentNotFoundException ;
	
}
