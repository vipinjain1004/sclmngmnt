package com.jain.schl.sclmngmnt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(ignoreResourceNotFound= false,  value="file:/D:/SchoolManagement/application.properties")
public class SclmngmntApplication {

	public static void main(String[] args) {
		SpringApplication.run(SclmngmntApplication.class, args);
	}
}
