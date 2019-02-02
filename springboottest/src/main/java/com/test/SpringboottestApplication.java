package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
//public class SpringboottestApplication extends  SpringBootServletInitializer{
public class SpringboottestApplication {

	public static void main(String[] args) {
		System.out.println("hello");
		SpringApplication.run(SpringboottestApplication.class, args);
	}

	/*@Override
	 protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	  return application.sources(SpringboottestApplication.class);
	 }*/
}

