package com.prince.demo;

import java.util.Scanner;

import com.prince.demo.domain.Project;
import com.prince.demo.service.ProjectServiceImpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	private static ProjectServiceImpl service = new ProjectServiceImpl();

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		service.remove(0);

	}



}
