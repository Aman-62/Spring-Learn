package com.achievers.learnspring.examples.part5;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass {
    private SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency) {
        this.someDependency = someDependency;
        System.out.println("All dependencies are ready!");
    }

    @PostConstruct
    public void initialize() {
        someDependency.getReady();
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("Cleanup");
    }
}

@Component
class SomeDependency {
    public  void getReady() {
        System.out.println("Some logic using SomeDependency");
    }
}

@Configuration
@ComponentScan
public class PrePostAnnotationApplication {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(PrePostAnnotationApplication.class);

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);


        System.out.println("Before close");
        context.close();
        System.out.println("After close");

    }
}
