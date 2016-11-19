package com.teckcoder.pong.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.teckcoder.pong.GameAssets;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		
		config.title = "pong";
		config.width = 720;
		config.height = 480;
		
		new LwjglApplication(new GameAssets(), config);
	}
}
