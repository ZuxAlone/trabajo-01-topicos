package com.mygdx.game.GameObjects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Square extends Figure {
    public Square(int x, int y, int width, int height, int xSpeed, int ySpeed) {
        super(x, y, width, height, xSpeed, ySpeed);
        color = Color.GREEN;
    }

    public void draw(ShapeRenderer shapeRenderer) {
        super.draw(shapeRenderer);
        shapeRenderer.rect(x, y, width, height);
    }

    public void update() {
        super.update();
        if (x < 0 || x > Gdx.graphics.getWidth() - width) {
            xSpeed = -xSpeed;
        }
        if (y < 0 || y > Gdx.graphics.getHeight() - height) {
            ySpeed = -ySpeed;
        }
    }
}
