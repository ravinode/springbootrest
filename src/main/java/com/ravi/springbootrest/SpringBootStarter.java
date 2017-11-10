package com.ravi.springbootrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("spring.devtools.restart.enabled", "false");
		SpringApplication.run(SpringBootStarter.class, args);

	}

}
