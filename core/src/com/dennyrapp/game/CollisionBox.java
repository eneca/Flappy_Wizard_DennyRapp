package com.dennyrapp.game;
/**
 * 
 * @author Denny
 *	ist das überhaupt nötig ? sollte auch mit normalen sprites gehen
 *	man muss nur die checkCollision benutzen
 */
public class CollisionBox {
	public float x,y;
	public int width,height;
	
	public CollisionBox(float x,float y,int width, int height) {
		this.x =x;
		this.y=y;
		this.width = width;
		this.height = height;
	}
	
	public void setPos(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean checkCollision(CollisionBox cb) {
		return this.x < cb.x + cb.width && this.y < cb.y + cb.height && this.x + this.width > cb.x && this.y + this.height > cb.y;
	}
}
