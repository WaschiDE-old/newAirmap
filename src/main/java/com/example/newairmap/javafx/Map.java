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


    }
}
