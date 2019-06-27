package com.base.engine.core;

import com.base.engine.internalGame.Game;

public class Main {

	public static void main(String[] args) {

		int width = 800, height = 600, frameRate = 6000;
		String windowTitle = "3D Engine";

		TestGame game = new TestGame();
		
		CoreEngine engine = new CoreEngine(frameRate, game);
		engine.createWindow(width, height, windowTitle);
		engine.start();
	}

}