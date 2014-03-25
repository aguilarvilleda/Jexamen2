package com.me.mygdxgame;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

public class InputPausa extends InputListener{

		Pausa pa;
		InputPausa(Pausa param)
		{
			super();
			pa=param;
		}
		public boolean touchDown(InputEvent event, float x, float y, int pointer, int button){
			
			System.out.println("Se ha presionado el boton pausa");
			
			return true;
		}
}
