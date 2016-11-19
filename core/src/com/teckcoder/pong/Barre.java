package com.teckcoder.pong;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public class Barre {
	
	protected Sprite imageBarre = new Sprite(new Texture("barre.png"));
	float vitesseBarre = 10;

	
	
	public Barre(float x){
		
		imageBarre.setPosition(x, 0);
		
	}
	
	public void update(){
		
		if(Gdx.input.isKeyPressed(Keys.UP)){
			imageBarre.translateY(vitesseBarre);
		}else if(Gdx.input.isKeyPressed(Keys.DOWN)){
			imageBarre.translateY(-vitesseBarre);
		}
		
		if(imageBarre.getY() < 0 ){
			imageBarre.setY(0);
		}
		else if(imageBarre.getY() + imageBarre.getHeight()> Gdx.graphics.getHeight()){
			imageBarre.setY(Gdx.graphics.getHeight()-imageBarre.getHeight());
		}
		
	}
	

	public void draw(SpriteBatch feuilleDessinEcran){
		imageBarre.draw(feuilleDessinEcran);
	}

	public void collision(Balle balle){
		Sprite imageBalle = balle.getSprite();
		
		if(imageBalle.getBoundingRectangle().overlaps(imageBarre.getBoundingRectangle())){
			balle.inversionDeplacementX();
		}
	}
}
