package com.learning.springframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Primary
public class wrestling implements GamingConsole {

	@Override
	public void up() {
		System.out.println("hit the opponent");

	}

	@Override
	public void down() {
		System.out.println("escape from the opponent");

	}

	@Override
	public void left() {
		System.out.println("put the finishing move");

	}

	@Override
	public void right() {
		System.out.println("use a chair table bench to trick opponent");

	}

}
