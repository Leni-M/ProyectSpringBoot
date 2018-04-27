package com.GLeni.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//clase
@RestController
public class DemoApplication {
    /**
     *
     * */
	@RequestMapping("/")//GET
	String home(){
		return "Hello World!";
	}
	@RequestMapping("/hello")//GET
	String home2(){
		return "Hello World!";
	}
	@RequestMapping("/leni")//GET
	String home3(){
		return "Hello World!";
	}
	//SOLID repasar
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
