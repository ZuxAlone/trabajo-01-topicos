package com.mygdx.game.Interfaces;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public interface IFactory {
    void render(ShapeRenderer shapeRenderer);
    void destroy();
}
