
package com.me.mygdxgame;

import java.util.ArrayList;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;





public class MyGdxGame implements ApplicationListener {
	private OrthographicCamera camera;
	private SpriteBatch batch;
	private Texture texture;
	private Texture pelotita;
	private Texture texture_nave, pause;
	private Sprite sprite, Spritepause;
	private Sprite sprite2;
	private Sprite sprite_nave;
	
	private Image i, pa;
	Pelotita p;
	Stage s, sboton;
	ArrayList<Sprite>sprites=new ArrayList<Sprite>();
	ArrayList<Pelotita>Pelotitas=new ArrayList<Pelotita>();
	ArrayList<pelotitamala>pelotitasm=new ArrayList<pelotitamala>();
	int rotacion=0;
	private Fin fin;
	private Texture sale;
	@Override
	public void create()
	{		
		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();
		
		
		camera = new OrthographicCamera(1, h/w);
		batch = new SpriteBatch();
		texture = new Texture(Gdx.files.internal("data/libgdx.png"));
		//pelotita  = new Texture(Gdx.files.internal("data/pelotita1.png"));
		
		
		texture.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		
		TextureRegion region = new TextureRegion(texture, 0, 0, 512, 275);
		
		sprite = new Sprite(region);
		sprite2 = new Sprite(region);
		sprite2.setPosition(0,-0.5f);
		sprite2.setSize(0.9f, 0.9f * sprite.getHeight() / sprite.getWidth());
		sprite.setSize(0.9f, 0.9f * sprite.getHeight() / sprite.getWidth());
		sprite.setOrigin(sprite.getWidth()/2, sprite.getHeight()/2);
		sprite.setPosition(0,0);
		sprite.setRotation(25);
		
		
		texture_nave = new Texture(Gdx.files.internal("data/nave.png"));
		sprite_nave=new Sprite(texture_nave,128,64);
		sprite_nave.setPosition(-0.5f,-0.5f);
		sprite_nave.setSize(0.5f, 0.50f);
		
		sale = new Texture(Gdx.files.internal("data/fin.png"));
		pause = new Texture(Gdx.files.internal("data/pausa.png"));
		
		s=new Stage();
		sboton = new Stage();
		pa = new Image(pause);
		i=new Image(texture);
		s.addActor(i);
		sboton.addActor(pa);
		
		 InputMultiplexer multi = new InputMultiplexer();
		 multi.addProcessor(s);
		 multi.addProcessor(sboton);
		 
		
		
		Gdx.input.setInputProcessor(multi);
		
		for(int i=0;i<10;i++)
		{
			Pelotita p = new Pelotita((int)(Math.random()*1000%w),(int)(Math.random()*1000%h));
			s.addActor(p);
			Pelotitas.add(p);
		}
		for(int i=0;i<5;i++)
		{
			pelotitamala t=new pelotitamala((int)(Math.random()*1000%w),(int)(Math.random()*1000%h));
			s.addActor(t);
			Pelotitas.add(p);
	
		}

		Gdx.input.setInputProcessor(s);

		Bienvenida ib= new Bienvenida();
		s.addActor(ib);
		
	}

	@Override
	public void dispose() {
		batch.dispose();
		texture.dispose();
	}

	@Override
	public void render() {	
		sprite.setRotation(rotacion);
	
		
		Gdx.gl.glClearColor(4, 2, 6, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		
		
		batch.setProjectionMatrix(camera.combined);
		
		
		s.act();
		
		s.draw();
		
		sboton.draw();
		
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}
}
