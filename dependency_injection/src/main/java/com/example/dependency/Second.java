package com.example.dependency;

import org.springframework.stereotype.Component;

@Component
public class Second {
	void execute()
	{
		System.out.println("executing");
	}

}
