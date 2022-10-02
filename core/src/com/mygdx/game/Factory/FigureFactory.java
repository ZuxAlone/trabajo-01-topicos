package com.mygdx.game.Factory;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.mygdx.game.GameObjects.Circle;
import com.mygdx.game.GameObjects.Figure;
import com.mygdx.game.GameObjects.Square;
import com.mygdx.game.Interfaces.IFactory;

import java.util.ArrayList;

public class FigureFactory implements IFactory {
    private ArrayList<Figure> figures;

    public FigureFactory() {
        figures = new ArrayList<>();
    }

    public void build(int colum, int numColum, int y) {
        Figure figure;
        if (colum % 2 == 0) figure = buildSquare();
        else figure = buildCircle();
        int x = (Gdx.graphics.getWidth() / numColum) * colum + (Gdx.graphics.getWidth() / numColum) / 2;
        figure.setX(x);
        figure.setY(Gdx.graphics.getHeight() - figure.getHeight() - y);
        figures.add(figure);
    }

    private Figure buildSquare() {
        return new Square(0, 0, 20, 20);
    }

    private Figure buildCircle() {
        return new Circle(0, 0, 10);
    }

    @Override
    public void render(ShapeRenderer shapeRenderer) {
        for (Figure figure : figures) {
            figure.draw(shapeRenderer);
        }
    }

    @Override
    public void destroy() {

    }
}
