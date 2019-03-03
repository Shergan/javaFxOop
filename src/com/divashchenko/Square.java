package com.divashchenko;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Square extends Figure {

    public Square(GraphicsContext gc, double x, double y) {
        super(gc, x, y);
    }

    @Override
    public void draw() {
        diameter = 30;

        gc.setFill(Color.GREEN);
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(2);

        gc.fillRect(x, y, diameter, diameter);
        gc.strokeRect(x, y, diameter, diameter);
    }

}
