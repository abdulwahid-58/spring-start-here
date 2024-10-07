package com.start.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.start.spring.chapter2.atauwire.thirdapproach.Person;


//import com.start.spring.chapter2.personparroteg.Person;
//import com.start.spring.config.ProjectConfiguration;

@SpringBootApplication
public class Application {

	private static ApplicationContext context;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
//		chapter3
//		ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
//		Person person = context.getBean(Person.class);
//		System.out.println("main method : "+person);
		
//		context = new AnnotationConfigApplicationContext(com.start.spring.chapter2.atautowire.firstapproach.ProjectConfiguration.class);
//		com.start.spring.chapter2.atautowire.firstapproach.Person person = context.getBean(com.start.spring.chapter2.atautowire.firstapproach.Person.class);
//		System.out.println(person);
		
//		context = new AnnotationConfigApplicationContext(com.start.spring.chapter2.atautowire.secondapproach.ProjectConfiguration.class);
//		Person person = context.getBean(Person.class);
//		System.out.println(person);
		
		
		
		context = new AnnotationConfigApplicationContext(com.start.spring.chapter2.atauwire.thirdapproach.ProjectConfiguration.class);
		Person person = context.getBean(Person.class);
		System.out.println(person);
	}

}
