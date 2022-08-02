package com.example.newairmap.javafx;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Map extends Canvas {

    private final GraphicsContext context = this.getGraphicsContext2D();

    public Map(){
        super(600,600);

        drawCircle( );


    }

    public void drawCircle(){
        int mittelpunktx = 300;
        int mittelpunkty = 300;
        int radius = 20;

        context.setLineWidth(2.0);
        context.setStroke(Color.BLACK);
        context.setFill(Color.PURPLE);
        context.fillOval(mittelpunktx,mittelpunkty,radius,radius);

    }
}
