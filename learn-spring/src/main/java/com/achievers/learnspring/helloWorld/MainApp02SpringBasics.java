package com.achievers.learnspring.helloWorld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp02SpringBasics {
	public static void main(String[] args) {
		// 1. Launch a Spring Context
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

		// 2. Configure the things that we want spring to manage -
		// HelloWorldConfiguration - @Configuration
		// name - @Bean

		// 3. Retrieving Beans managed by Spring
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));

		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("person2MethodCall"));
		System.out.println(context.getBean("person3Parameters"));
		System.out.println(context.getBean("person4Parameters"));

		System.out.println(context.getBean("addressHome"));
		System.out.println(context.getBean("addressOffice"));
		//System.out.println(context.getBean(Address.class));

		System.out.println("Qualifier Bean");
		System.out.println(context.getBean("person5Qualifier"));


		System.out.println("List Of All Beans:");

		//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}
}
