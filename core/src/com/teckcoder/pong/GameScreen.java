package com.teckcoder.pong;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameScreen implements Screen {
	
	Balle bouboule = new Balle();
	Balle bouboule2 = new Balle();
	Balle bouboule3 = new Balle();
	Barre barre = new Barre(100);
	SpriteBatch feuilleDessinEcran;	
	Texture fondDecran = new Texture("background.png");
	
	@Override
	public void show() {
		feuilleDessinEcran = new SpriteBatch();
	}

	@Override
	public void render(float delta) {
		
		//avantrender	
		update();
		
		//render
		Gdx.gl20.glClear(GL20.GL_COLOR_BUFFER_BIT);
		Gdx.gl20.glClearColor(0, 0, 0, 1);
		
		feuilleDessinEcran.begin();
		
			feuilleDessinEcran.draw(fondDecran, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
			bouboule.draw(feuilleDessinEcran);
			bouboule2.draw(feuilleDessinEcran);
			bouboule3.draw(feuilleDessinEcran);
			barre.draw(feuilleDessinEcran);
		
		feuilleDessinEcran.end();

	}

	private void update() {
		bouboule.update();
		bouboule2.update();
		bouboule3.update();
		barre.update();
		
		barre.collision(bouboule);
		barre.collision(bouboule2);
		barre.collision(bouboule3);
		
		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
	}

}
