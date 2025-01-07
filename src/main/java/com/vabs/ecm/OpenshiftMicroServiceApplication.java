package com.vabs.ecm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class OpenshiftMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenshiftMicroServiceApplication.class, args);
	}

	public void run(String... args) throws Exception {
		log.debug("********************** OpenshiftMicroServiceApplication **********************");
    }
}
