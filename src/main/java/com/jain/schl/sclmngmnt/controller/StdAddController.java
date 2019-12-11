package com.jain.schl.sclmngmnt.controller;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jain.schl.sclmngmnt.model.StudentInfo;
import com.jain.schl.sclmngmnt.serviceImp.StdStudentAddUpdateServiceImp;

@RestController
public class StdAddController {
	private static Logger LOGGER = LoggerFactory.getLogger(StdAddController.class);
	@Autowired
	private StdStudentAddUpdateServiceImp stdStudentAddUpdateServiceImp;
	@Transactional
	@PostMapping(value="/student/add", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE )
	public StudentInfo addStudent(@Valid @RequestBody StudentInfo studentInfo) throws Exception{
		stdStudentAddUpdateServiceImp.addStudent(studentInfo);
		LOGGER.info(studentInfo.toString());
		return studentInfo;		
	}
	@GetMapping(value="/student/{stdId}")
	public StudentInfo getStudentById(@PathVariable(value = "stdId") String stdId){
		LOGGER.info(stdId);
		LOGGER.info(stdStudentAddUpdateServiceImp.getStudentById(stdId).get().toString());
		return stdStudentAddUpdateServiceImp.getStudentById(stdId).get();
	}
	
	@GetMapping(value="/student")
	public List<StudentInfo> getStudentByName(@RequestParam("name") String name){
		return stdStudentAddUpdateServiceImp.getStudentByName(name);
		
	}
	
}
