package com.jain.schl.sclmngmnt.service;

import java.util.List;
import java.util.Optional;

import com.jain.schl.sclmngmnt.model.StudentInfo;

public interface StdStudentAddUpdateService {

	public StudentInfo addStudent(StudentInfo studentInfo);
	public StudentInfo updateStudent(StudentInfo studentInfo);
	public Optional<StudentInfo> getStudentById(String stdId);
	public List<StudentInfo> getStudentByName(String name);
}
