package com.achievers.learnspring.advance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusinessClass {
	// Field Based
	// @Autowired
	Dependency1 dependency1;
	// @Autowired
	Dependency2 dependency2;

	// Constructor
	// public YourBusinessClass(Dependency1 dOne, Dependency2 dTwo) {
		// this.dependency1=dOne;
		// this.dependency2=dTwo;
	// }

	// Setter Based
	@Autowired
	public void setDependency1(Dependency1 dependency1) {
		this.dependency1 = dependency1;
	}
	@Autowired
	public void setDependency2(Dependency2 dependency2) {
		this.dependency2 = dependency2;
	}

	public String toString() {
		return "Using " + dependency1 + " and " + dependency2;
	}
}
@Component
class Dependency1 {}
@Component
class Dependency2 {}

@Configuration
@ComponentScan
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(DependencyInjectionApplication.class);

		System.out.println(context.getBean(YourBusinessClass.class));

	}
}

