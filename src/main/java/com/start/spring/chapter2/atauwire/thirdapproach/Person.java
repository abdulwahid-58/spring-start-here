package com.start.spring.chapter2.atauwire.thirdapproach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	private static int counter = 0;
	
	public Person() {
		counter++;
		System.out.println("Person Objects : "+ counter);
	}

	@Autowired
	public Person(Parrot parrot) {
		System.out.println("dependency injection through contructor...");
		this.parrot = parrot;
	}
	
	@Value("3rd - Aziz")
	private String name;
	
	private Parrot parrot;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

	public Parrot getParrot() {
		return parrot;
	}

	@Autowired
	public void setParrot(Parrot parrot) {
		System.out.println("dependency injection through setter method...");
		this.parrot = parrot;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + " has " + parrot + "]";
	}
	
	
}
