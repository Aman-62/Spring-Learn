package com.achievers.learnspring.helloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name, int age, Address address) {};

record Address (String lane, String city) {};

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "Rahul";
    }
    @Bean
    public int age() {
        return 24;
    }
    @Bean
    public Person person(){
        return new Person("Mohit", 27, new Address("25th", "Dehradun"));
    }
    @Bean
    public Person person2MethodCall(){
        return new Person(name(), age(), address());
    }
    @Bean
    public Person person3Parameters(String name, int age, Address addressOffice){
        return new Person(name, age, addressOffice);
    }
    @Bean
    public Person person4Parameters(String name, int age, Address address){
        return new Person(name, age, address);
    }
    @Bean
    public Person person5Qualifier(String name, int age, @Qualifier("addressQualifier") Address address){
        return new Person(name, age, address);
    }

    @Bean(name = "addressHome")
    @Qualifier("addressQualifier")
    public Address address() {
        return new Address("10th", "Delhi");
    }
    @Bean(name = "addressOffice")
    @Primary
    public Address address2() {
        return new Address("Building", "Noida");
    }
}
