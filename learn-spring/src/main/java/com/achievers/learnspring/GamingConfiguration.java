package com.achievers.learnspring;

import com.achievers.learnspring.game.GameRunner;
import com.achievers.learnspring.game.GamingConsole;
import com.achievers.learnspring.game.MarioGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game(){
        return new MarioGame();
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game){
        return new GameRunner(game);
    }

}
