package com.mygdx.game.GameObjects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Circle extends Figure {
    public Circle(int x, int y, int radius, int xSpeed, int ySpeed) {
        super(x, y, radius, xSpeed, ySpeed);
        color = Color.CYAN;
    }

    public void draw(ShapeRenderer shapeRenderer) {
        super.draw(shapeRenderer);
        shapeRenderer.circle(x, y, radius);
    }

    public void update() {
        super.update();
        if (x < radius || x > Gdx.graphics.getWidth() - radius) {
            xSpeed = -xSpeed;
        }
        if (y < radius || y > Gdx.graphics.getHeight() - radius) {
            ySpeed = -ySpeed;
        }
    }
}
