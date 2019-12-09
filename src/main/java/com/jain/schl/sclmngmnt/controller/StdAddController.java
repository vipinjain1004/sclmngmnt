package com.jain.schl.sclmngmnt.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jain.schl.sclmngmnt.model.StudentInfo;
import com.jain.schl.sclmngmnt.service.StdStudentAddUpdateService;
import com.jain.schl.sclmngmnt.serviceImp.StdStudentAddUpdateServiceImp;

@RestController
public class StdAddController {
	private static Logger LOGGER = LoggerFactory.getLogger(StdAddController.class);
	@Autowired
	private StdStudentAddUpdateServiceImp stdStudentAddUpdateServiceImp;
	@PostMapping(value="/student/add", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE )
	public StudentInfo addStudent(@RequestBody StudentInfo studentInfo){
		stdStudentAddUpdateServiceImp.addStudent(studentInfo);
		LOGGER.info(studentInfo.toString() );
		return studentInfo;
		
		
	}

}
