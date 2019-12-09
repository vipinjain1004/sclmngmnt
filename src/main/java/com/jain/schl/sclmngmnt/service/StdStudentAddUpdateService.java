package com.jain.schl.sclmngmnt.service;

import org.springframework.stereotype.Service;

import com.jain.schl.sclmngmnt.model.StudentInfo;

@Service
public interface StdStudentAddUpdateService {

	public StudentInfo addStudent(StudentInfo studentInfo);
	public StudentInfo updateStudent(StudentInfo studentInfo);
	
}
