package com.achievers.learnspring;

import java.io.Serializable;

class Pojo {
    private String name;
    private int age;
    public String toString() {
        return name + ":" + age;
    }
}

class JavaBean implements Serializable {

    //1. public no-arg constructor
    public JavaBean() {}

    private String name;
    private int age;

    //2. Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return name + ":" + age;
    }
}

public class SpringBeanVsPojo {
    public static void main(String[] args) {
        Pojo pojo = new Pojo();
        System.out.println(pojo);;
    }
}
