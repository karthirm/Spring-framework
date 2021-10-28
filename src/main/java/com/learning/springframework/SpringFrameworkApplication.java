package com.learning.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.learning.springframework.game.GameRunner;

@SpringBootApplication
public class SpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				SpringApplication.run(SpringFrameworkApplication.class, args);
		
		GameRunner runner = context.getBean(GameRunner.class);
		
		//RoadRash game = new RoadRash();
		//ContraGame game = new ContraGame();
		
		//GameRunner runner = new GameRunner(game);
		
		runner.runGame();
		
	}

}
