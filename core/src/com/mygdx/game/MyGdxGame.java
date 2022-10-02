package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.mygdx.game.Factory.FigureFactory;

public class MyGdxGame extends ApplicationAdapter {
	ShapeRenderer shapeRenderer;
	FigureFactory figureFactory;

	private int cantFigures = 40;
	private int numColumnas = 6;
	
	@Override
	public void create () {
		shapeRenderer = new ShapeRenderer();
		figureFactory = new FigureFactory();
		init();
	}

	private void init() {
		int y = 5;
		for (int i = 0; i < cantFigures; i++) {
			if (i % numColumnas == 0) y += 30;
			figureFactory.build(i % numColumnas, numColumnas, y);
		}
	}

	@Override
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
		figureFactory.render(shapeRenderer);
		shapeRenderer.end();
	}
	
	@Override
	public void dispose () {
	}
}
