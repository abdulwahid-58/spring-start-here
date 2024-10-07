package com.start.spring.chapter2.atauwire.thirdapproach;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Parrot {
	
	private static int counter = 0;
	
	public Parrot() {
		counter++;
		System.out.println("Parrot Objects : "+counter);
	}
	
	

	@Value("3rd - Kuko")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Parrot [name=" + name + "]";
	}
	
}
