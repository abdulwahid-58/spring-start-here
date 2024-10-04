package com.start.spring.chapter2.atautowire.firstapproach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	@Value("Aziz")
	private String name;
	
	@Autowired
	private Parrot parrot;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + " has " + parrot + "]";
	}
	
	

}
