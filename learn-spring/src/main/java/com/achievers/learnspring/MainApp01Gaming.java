package com.achievers.learnspring;

import com.achievers.learnspring.game.GameRunner;
import com.achievers.learnspring.game.MarioGame;
import com.achievers.learnspring.game.PacmanGame;
import com.achievers.learnspring.game.SuperContraGame;

public class MainApp01Gaming {

	public static void main(String[] args) {
		//var game = new MarioGame();
		var game = new PacmanGame();
		//var game = new SuperContraGame(); // 1: Object Creation

		var gameRunner = new GameRunner(game);
		// 2: Object Creation + wiring of Dependencies
		// Game is a Dependency of GameRunner

		gameRunner.run();
	}
}
