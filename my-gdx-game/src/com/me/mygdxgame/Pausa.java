package com.me.mygdxgame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Pausa extends Image {
		public Pausa()
		{
			super(new Texture("data/pausa.png"));
	        this.addListener(new InputPausa(this));
	}
}
