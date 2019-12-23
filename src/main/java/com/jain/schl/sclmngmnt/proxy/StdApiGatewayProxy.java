package com.jain.schl.sclmngmnt.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.jain.schl.sclmngmnt.model.StdConfModel;

@Component
@FeignClient(name="school-netflix-zuul-service")
@RibbonClient(name="school-student-service")
public interface StdApiGatewayProxy {
	@GetMapping(value="/school-student-service/searchById/{id}")
	public StdConfModel getStudentById(@PathVariable(value = "id", required= true) Long id);
	
	@GetMapping(value="/school-student-service/searchByKey/{key}")
	public StdConfModel getStudentByName(@PathVariable("key") String key);
}
