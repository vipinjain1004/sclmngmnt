package com.jain.schl.sclmngmnt.controller;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jain.schl.sclmngmnt.model.StdBasicInfo;
import com.jain.schl.sclmngmnt.serviceImp.StdBasicInfoServiceImp;

@RestController
public class StdBasicInfoController {
	private static Logger LOGGER = LoggerFactory.getLogger(StdBasicInfoController.class);
	@Autowired
	private StdBasicInfoServiceImp stdStudentAddUpdateServiceImp;
	
	@Transactional
	@PostMapping(value="/student/add")
	public StdBasicInfo addStudent(@Valid @RequestBody StdBasicInfo studentInfo) throws Exception{
		studentInfo = stdStudentAddUpdateServiceImp.addStudent(studentInfo);
		LOGGER.info(studentInfo.toString());
		return studentInfo;		
	}
	@GetMapping(value="/student/{stdId}")
	public StdBasicInfo getStudentById(@PathVariable(value = "stdId") String stdId){
		LOGGER.info(stdId);
		LOGGER.info(stdStudentAddUpdateServiceImp.getStudentById(stdId).get().toString());
		return stdStudentAddUpdateServiceImp.getStudentById(stdId).get();
	}
	
	@GetMapping(value="/student")
	public List<StdBasicInfo> getStudentByName(@RequestParam("name") String name){
		return stdStudentAddUpdateServiceImp.getStudentByName(name);
		
	}
	
}
