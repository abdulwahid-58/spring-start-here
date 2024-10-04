//package com.start.spring.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import com.start.spring.chapter2.personparroteg.Parrot;
//import com.start.spring.chapter2.personparroteg.Person;
//
//@Configuration
//public class ProjectConfiguration {
//	
//	@Bean
//	public Person person(Parrot parrot) {
//		Person person = new Person();
//		person.setName("Aziz");
//		person.setParrot(parrot);
//		return person;
//	}
//	
//	@Bean
//	public Parrot parrot() {
//		Parrot parrot = new Parrot();
//		
//		parrot.setName("Koko");
//		
//		return parrot;
//	}
//}
