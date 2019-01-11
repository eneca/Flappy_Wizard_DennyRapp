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
	
	Sprite sprite;
	public GameScreen(FlappyGame game) {
		this.game = game;
		sprite = new Sprite(game.harry);
		int harry_width = (int)(game.harry.getWidth() * 0.125);
		int harry_height = (int)(game.harry.getHeight() * 0.125);
		sprite.setSize(harry_width, harry_height);
		camera = new OrthographicCamera();
		camera.setToOrtho(false, 1280, 720);
	}	
	
	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		Gdx.gl.glClearColor(0, 0.5f, 0.5f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		if(Gdx.input.isKeyPressed(Input.Keys.SPACE)) {
			if(sprite.getY()<= 550) {
				sprite.translateY(10);
			}
		}else {
			if(sprite.getY() > 0){
				sprite.translateY(-1);
			}
			
		}
		/*
		int harry_width = (int)(game.harry.getWidth() * 0.125);
		int harry_height = (int)(game.harry.getHeight() * 0.125);
		*/
		game.batch.begin();
		sprite.draw(game.batch);
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
