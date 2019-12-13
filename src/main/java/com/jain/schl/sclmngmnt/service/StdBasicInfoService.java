package com.jain.schl.sclmngmnt.service;

import java.util.List;
import java.util.Optional;

import com.jain.schl.sclmngmnt.model.StdBasicInfo;

public interface StdBasicInfoService {
	public StdBasicInfo addStudent(StdBasicInfo studentInfo);
	public StdBasicInfo updateStudent(StdBasicInfo studentInfo);
	public Optional<StdBasicInfo> getStudentById(String stdId);
	public List<StdBasicInfo> getStudentByName(String name);
}
