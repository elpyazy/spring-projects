package com.practice.ms_practice2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MsPractice2Application {

	@GetMapping("/test")
	public String test(){

		return "Hello test!!";
	}

	@GetMapping("/test2")
	public String test2(){

		return "Hello Test2";
	}

	@GetMapping("/test3")
	public String test3(){

		return "Hello Test3";
	}
	@GetMapping("/test4")
	public String test4(){

		return "Hello Test4";
	}

	@GetMapping("/test5")
	public String test5(){

		return "Hello Test5";
	}

	public static void main(String[] args) {
		SpringApplication.run(MsPractice2Application.class, args);
	}

}
