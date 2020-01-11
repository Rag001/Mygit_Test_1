package com.sb.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.sb.*")
public class SbGitRApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbGitRApplication.class, args);
	}

}
