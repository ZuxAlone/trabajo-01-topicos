package com.mygdx.game.GameObjects;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Square extends Figure {
    public Square(int x, int y, int width, int height) {
        super(x, y, width, height);
        color = Color.GREEN;
    }

    public void draw(ShapeRenderer shapeRenderer) {
        super.draw(shapeRenderer);
        shapeRenderer.rect(x, y, width, height);
    }
}
