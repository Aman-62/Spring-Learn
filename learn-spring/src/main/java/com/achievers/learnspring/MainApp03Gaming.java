package com.achievers.learnspring;

import com.achievers.learnspring.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp03Gaming {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);

		System.out.println(context.getBean(GameRunner.class));
		context.getBean(GameRunner.class).run();
	}
}

