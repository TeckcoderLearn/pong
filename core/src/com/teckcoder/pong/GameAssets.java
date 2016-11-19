package com.teckcoder.pong;

import com.badlogic.gdx.Game;

public class GameAssets extends Game {

	@Override
	public void create() {
		// TODO Auto-generated method stub
		GameScreen monNouvelleEcran = new GameScreen();
		setScreen(monNouvelleEcran);
	}
	
}
