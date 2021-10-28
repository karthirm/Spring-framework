package com.learning.springframework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

	//field injection
	@Autowired
	private GamingConsole game;
	
	//constructor injection
//	public GameRunner(GamingConsole game) {
//		this.game = game;
//	}
	

	//setter injection
	@Autowired
	public void setGame(GamingConsole game) {
		System.out.println("using setter");
		this.game = game;
	}

	

	public void runGame() {
		game.up();
		game.down();
		game.left();
		game.right();
		
	}

}
