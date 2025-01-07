package com.vabs.ecm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/openshift/api/v1")
@Slf4j
public class OpenShiftController {
	
	@GetMapping(path="/sayHello")
	 public String sayHello() {
			String serviceName = "Welcome to Openshift Spring Boot application - v1";
			try {
				 log.info("Get():: {}", "vabs-fnetsrv01.vabsecm.com: "+serviceName);
			}catch (Exception e) {
				e.printStackTrace();
			}
			return serviceName;
	 }
	
	
	@GetMapping(path="/testsql")
	public int testOSSQL() {
		int count = 0;
		try {
				log.info("test OpenShift SQL successful -> {}", "Database Connection successful and test query count is = "+count);
		}catch(Exception e) {
			log.error("Exception occured while testOSSQL :: {}", e);
			e.printStackTrace();
		}
		return count;
	}

}
