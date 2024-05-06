package com.achievers.learnspring;

import com.achievers.learnspring.game.GameRunner;
import com.achievers.learnspring.game.GamingConsole;
import com.achievers.learnspring.game.MarioGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.achievers.learnspring.game")
public class MainApp04GamingSpringBeans {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(MainApp04GamingSpringBeans.class);
		context.getBean(GameRunner.class).run();
	}
}

