package com.learning.springframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class RoadRash implements GamingConsole {

	 @Override
	public void up() {
		 System.out.println("increase speed");
	 }
	 
	 @Override
	public void down() {
		 System.out.println("pick a different direction");
	 }
	 
	 @Override
	public void left() {
		 System.out.println("kick an opponent");
	 }
	 
	 @Override
	public void right() {
		 System.out.println("block way");
	 }
}
