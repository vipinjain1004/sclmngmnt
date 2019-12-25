package com.jain.schl.sclmngmnt.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.jain.schl.sclmngmnt.model.StdConfModel;

@Component
@FeignClient(name="school-netflix-zuul-service")
@RibbonClient(name="school-configuration-service")
public interface StdApiGatewayProxy {
	
	@GetMapping(value="/school-configuration-service/searchById/{id}")
	public StdConfModel getConfById(@PathVariable(value = "id", required= true) Long id);
	
	@GetMapping(value="/school-configuration-service/searchByKey/{key}")
	public StdConfModel getConfByKey(@PathVariable(value = "key") String key);
	
}
