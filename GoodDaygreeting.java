package com.annotations.example3;

import org.springframework.stereotype.Component;

@Component
public class GoodDaygreeting implements Greeting {
	
	public String greeting = "have a good day";

	public GoodDaygreeting() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println(greeting);
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public String greet() {
		// TODO Auto-generated method stub
		return greeting;
	}

}