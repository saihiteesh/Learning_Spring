package com.example.dependency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
	 ApplicationContext reff = SpringApplication.run(DependencyInjectionApplication.class, args);
		
		Second sec =reff.getBean(Second.class); //asking spring to give an object of the Second class
		sec.execute(); //method calling
	}

}
