package com.me.mygdxgame;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

public class MiInputmala extends InputListener{
	
	pelotitamala t;
	MiInputmala(pelotitamala param)
	{
		super();
		t=param;
	}
	public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)
	{

		System.exit(0);
		
		return true;
	}
}
