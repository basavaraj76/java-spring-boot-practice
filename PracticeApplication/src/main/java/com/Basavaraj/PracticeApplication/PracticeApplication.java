package com.Basavaraj.PracticeApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) {

		ApplicationContext constext = SpringApplication.run(PracticeApplication.class, args);

		Developer d1 = constext.getBean(Developer.class);
		d1.buildingApp();


	}

}
