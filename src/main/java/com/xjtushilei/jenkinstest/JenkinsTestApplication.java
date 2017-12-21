package com.xjtushilei.jenkinstest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsTestApplication {

    @GetMapping("/hi")
    public String get(){
        return "hello jenkins test!";
    }


	public static void main(String[] args) {
		SpringApplication.run(JenkinsTestApplication.class, args);
	}
}
