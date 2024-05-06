package com.achievers.learnspring.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    //MarioGame game;
    //SuperContraGame game;
    GamingConsole game;
    public GameRunner(@Qualifier("SuperContraQualifier") GamingConsole game){
        this.game = game;
    }

    public void run () {
        System.out.println("Running game: " + game);

        game.up();
        game.right();
        game.down();
        game.left();
    }
}
