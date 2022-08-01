package com.example.newairmap.javafx;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Map extends Canvas {

    private final GraphicsContext context = this.getGraphicsContext2D();

    public Map(){
        super(600,600);

        drawCircle(300,300, 5);
        drawCircle(200,300, 5);

    }

    public void drawCircle(int x, int y, int radius){
        context.setStroke(Color.BLUE);
        context.setLineWidth(2.0);
        context.strokeOval (x,y,radius, radius);

    }
}
