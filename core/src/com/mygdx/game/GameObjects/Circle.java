package com.mygdx.game.GameObjects;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Circle extends Figure {
    public Circle(int x, int y, int radius) {
        super(x, y, radius);
        color = Color.CYAN;
    }

    public void draw(ShapeRenderer shapeRenderer) {
        super.draw(shapeRenderer);
        shapeRenderer.circle(x, y, radius);
    }
}
