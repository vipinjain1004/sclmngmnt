package com.jain.schl.sclmngmnt.controller;

import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jain.schl.sclmngmnt.exception.StudentNotFoundException;
import com.jain.schl.sclmngmnt.model.StdBasicInfo;
import com.jain.schl.sclmngmnt.serviceImp.StdBasicInfoServiceImp;

@RestController
@RequestMapping(value="/student")
public class StdBasicInfoController {
	private static Logger LOGGER = LoggerFactory.getLogger(StdBasicInfoController.class);
	@Autowired
	private StdBasicInfoServiceImp stdStudentAddUpdateServiceImp;
	
	@Transactional
	@PostMapping(value="/add")
	public StdBasicInfo addStudent(@Valid @RequestBody StdBasicInfo studentInfo) throws Exception{
		studentInfo = stdStudentAddUpdateServiceImp.addStudent(studentInfo);
		LOGGER.info(studentInfo.toString());
		return studentInfo;		
	}
	@GetMapping(value="/{stdId}")
	public StdBasicInfo getStudentById(@PathVariable(value = "stdId",required= true) @Max(value =10, message ="Student Id should be 10 charactor") String stdId) throws StudentNotFoundException{
		LOGGER.info(stdId);
		LOGGER.info(stdStudentAddUpdateServiceImp.getStudentById(stdId).get().toString());
		return stdStudentAddUpdateServiceImp.getStudentById(stdId).get();
	}
	
	@GetMapping(value="")
	public List<StdBasicInfo> getStudentByName(@RequestParam("name") String name) throws StudentNotFoundException{
		return stdStudentAddUpdateServiceImp.getStudentByName(name);
		
	}
	
	@GetMapping(value="/searchByNameAndLstName")
	public List<StdBasicInfo> getStudentByNameAndLName(@RequestParam Map<String,String> requestParams) throws StudentNotFoundException{
		return stdStudentAddUpdateServiceImp.findByStdFstNameAndLstName(requestParams.get("name"),requestParams.get("lastName"));
		
	}
	
}
