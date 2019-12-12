package com.jain.schl.sclmngmnt.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jain.schl.sclmngmnt.model.StdDetailsInfo;
import com.jain.schl.sclmngmnt.model.StdBasicInfo;
import com.jain.schl.sclmngmnt.service.StdDetailsInfoService;
import com.jain.schl.sclmngmnt.serviceImp.StdDetailsInfoServiceImp;
@RestController
@RequestMapping("studentDetails/")
public class StdDetailsInfoController {
	private static Logger LOGGER = LoggerFactory.getLogger(StdDetailsInfoController.class);
	@Autowired
	private StdDetailsInfoServiceImp stdDetailsInfoServiceImp;
	@PutMapping(value="/update")
	public StdDetailsInfo addStudent(@Valid @RequestBody StdDetailsInfo stdDetailsInfo) throws Exception{
		stdDetailsInfo = stdDetailsInfoServiceImp.addStudentDetails(stdDetailsInfo);
		LOGGER.info(stdDetailsInfo.toString());
		return stdDetailsInfo;		
	}
	
}
