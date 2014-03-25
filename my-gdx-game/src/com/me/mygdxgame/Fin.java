package com.me.mygdxgame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Fin extends Image{
	
	//Image sale;
	public Fin()
	
	{
		super(new Texture("data/fin.png"));
        addListener(new InputFin(this));
}

}
