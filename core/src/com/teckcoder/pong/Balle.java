package com.teckcoder.pong;

import java.util.Random;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public class Balle {

	protected Texture couleurDeBalle[] = {new Texture("balle.png"), new Texture("balle2.png"),new Texture("balle3.png"),new Texture("balle4.png"),new Texture("balle5.png")};
	
	protected Sprite imageBalle = new Sprite(couleurDeBalle[0]);
	protected float vitesseMax = 10;
	
	protected Random alea = new Random(); 
	
	protected float deplacementX = vitesseMax/(alea.nextInt(5)+1);
	protected float deplacementY = vitesseMax/(alea.nextInt(5)+1);
	
	public Balle() {
		imageBalle.setPosition(200, 200);
	}
	
	public void draw(SpriteBatch feuilleDessinEcran){
		imageBalle.draw(feuilleDessinEcran);
	}
	
	public void changeColor(){
		imageBalle.setTexture(couleurDeBalle[alea.nextInt(couleurDeBalle.length)]);
	}
	
	public void update() {
		
		imageBalle.translateX(deplacementX);
		imageBalle.translateY(deplacementY);
		
		if(imageBalle.getWidth() + imageBalle.getX() >= Gdx.graphics.getWidth()){
			inversionDeplacementX();
			changeColor();
			imageBalle.setX( Gdx.graphics.getWidth() - imageBalle.getWidth());
		}else if(imageBalle.getHeight() + imageBalle.getY() >= Gdx.graphics.getHeight()){
			inversionDeplacementY();
			changeColor();
			imageBalle.setY( Gdx.graphics.getHeight() - imageBalle.getHeight());
		}else if(imageBalle.getX() < 0){
			inversionDeplacementX();
			imageBalle.setX(0);
			changeColor();
		}else if(imageBalle.getY() < 0){
			inversionDeplacementY();
			imageBalle.setY(0);
			changeColor();
		}
	}

	public void inversionDeplacementX(){
		deplacementX = -deplacementX;
	}
	public void inversionDeplacementY(){
		deplacementY = -deplacementY;
	}

	public float getDeplacementX() {
		return deplacementX;
	}

	public void setDeplacementX(float deplacementX) {
		this.deplacementX = deplacementX;
	}

	public float getDeplacementY() {
		return deplacementY;
	}

	public void setDeplacementY(float deplacementY) {
		this.deplacementY = deplacementY;
	}

	public Sprite getSprite() {
		return imageBalle;
	}
	
}
