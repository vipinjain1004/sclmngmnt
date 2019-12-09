package com.jain.schl.sclmngmnt.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;

import com.jain.schl.sclmngmnt.model.StudentInfo;
import com.jain.schl.sclmngmnt.repo.StdStudentAddUpdateRepo;
import com.jain.schl.sclmngmnt.service.StdStudentAddUpdateService;

import org.springframework.stereotype.Service;
@Service
public class StdStudentAddUpdateServiceImp {
	@Autowired
	private StdStudentAddUpdateRepo stdStudentAddUpdateRepo;
	public StudentInfo addStudent(StudentInfo studentInfo){
		stdStudentAddUpdateRepo.save(studentInfo);
		return studentInfo;
	}
	public StudentInfo updateStudent(StudentInfo studentInfo){
		return studentInfo;
		
	}

}
