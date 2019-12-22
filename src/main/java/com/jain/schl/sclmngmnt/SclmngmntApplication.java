package com.jain.schl.sclmngmnt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@PropertySource(ignoreResourceNotFound= false,  value="file:/D:/SchoolManagement/application.properties")
@EnableJpaAuditing
@EnableDiscoveryClient
public class SclmngmntApplication {

	public static void main(String[] args) {
		SpringApplication.run(SclmngmntApplication.class, args);
	}
}
