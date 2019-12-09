package com.jain.schl.sclmngmnt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StdApi {

	@GetMapping(value="/")
	public String isServerOn(){
		return "Server is On!!!";
	}
}

