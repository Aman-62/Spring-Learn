package com.achievers.learnspring.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraQualifier")
public class SuperContraGame implements GamingConsole{

    public void up(){
        System.out.println("Up");
    }
    public void down(){
        System.out.println("Sit down");
    }
    public void left(){
        System.out.println("Go back");
    }
    public void right(){
        System.out.println("Shoot a bullet");
    }

    @Override
    public String toString() {
        return "SuperContra Game 2024 Edition";
    }
}
