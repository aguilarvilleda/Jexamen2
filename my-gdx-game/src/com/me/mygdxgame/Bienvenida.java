package com.me.mygdxgame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;


	public class Bienvenida extends Image {
		public Bienvenida()
		{
			super(new Texture("data/start.png"));
	        addListener(new InputBienvenida(this));
	}
		
}

