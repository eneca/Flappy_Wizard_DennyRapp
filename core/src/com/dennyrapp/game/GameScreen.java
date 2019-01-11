package com.dennyrapp.game;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class GameScreen implements Screen {

	final FlappyGame game;
	
	OrthographicCamera camera;
	
	Sprite sprite,tower_sprite;
	public GameScreen(FlappyGame game) {
		this.game = game;
		
		sprite = new Sprite(game.harry);
		int harry_width = (int)(game.harry.getWidth() * 0.125);
		int harry_height = (int)(game.harry.getHeight() * 0.125);
		sprite.setSize(harry_width, harry_height);
		
		tower_sprite = new Sprite(game.turm_gryffindor);
		//int penis = Gdx.graphics.getWidth();
		int tower_width = (int)(game.turm_gryffindor.getWidth() * 0.5);
		int tower_height = (int)(game.turm_gryffindor.getHeight() * 0.5);
		tower_sprite.setSize(tower_width, tower_height);
		tower_sprite.setPosition(1150, -250);
		
		
		camera = new OrthographicCamera();
		camera.setToOrtho(false, 1280, 720);
	}	
	
	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		Gdx.gl.glClearColor(0, 0.5f, 0.5f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		System.out.println(Gdx.graphics.getWidth());
		if(Gdx.input.isKeyPressed(Input.Keys.SPACE)) {
			if(sprite.getY()<= 550) {
				sprite.translateY(10);
			}
		}else {
			if(sprite.getY() > 0){
				sprite.translateY(-1);
			}
			
		}
		
		if(tower_sprite.getX() < -10) {
			tower_sprite.setPosition(1150, -250);
		}
		tower_sprite.translateX(-5);
		/*
		int harry_width = (int)(game.harry.getWidth() * 0.125);
		int harry_height = (int)(game.harry.getHeight() * 0.125);
		*/
		game.batch.begin();
		sprite.draw(game.batch);
		tower_sprite.draw(game.batch);
		/*
		game.batch.draw(game.harry
				, camera.viewportWidth / 2 - harry_width / 2
				, camera.viewportHeight / 2 - harry_height / 2
				, harry_width
				, harry_height
			);
			*/
		game.batch.end();
		
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
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
