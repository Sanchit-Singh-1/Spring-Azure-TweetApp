package com.tweetapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TweetAppApplication {

	@GetMapping("/add")
	public String add(){
		return "Hi there adding";
	}

	public static void main(String[] args) {
		SpringApplication.run(TweetAppApplication.class, args);
	}

}
