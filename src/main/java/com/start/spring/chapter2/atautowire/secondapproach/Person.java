package com.start.spring.chapter2.atautowire.secondapproach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

	@Value("2nd - Aziz")
	private String name;
	
	private Parrot parrot;
	
	@Autowired
	public Person(Parrot parrot) {
		this.parrot = parrot;
	}

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
