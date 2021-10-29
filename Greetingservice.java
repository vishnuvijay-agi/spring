package com.annotations.example3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Greetingservice {
	@Autowired
	@Qualifier("morningGreeting")
	 Greeting grt;
public Greetingservice() {
		super();
		// TODO Auto-generated constructor stub
	}
public Greeting getGrt() {
		return grt;
	}
	public void setGrt(Greeting grt) {
		this.grt = grt;
	}
public void  greeting()
{
	grt.greet();
}
}