package com.start.spring.chapter2.atautowire.secondapproach;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Parrot {

	@Value("2nd - Kuko")
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
