package com.example.newairmap.javafx;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Map extends Canvas {

    private final GraphicsContext context = this.getGraphicsContext2D();

    double xfirstClick;
    double yfirstClick;
    double xmiddleClick;
    double ymiddleClick;
    double xlastClick;
    double ylastClick;
    double deltax;
    double deltay;
    double mittelpunktx;
    double mittelpunkty;
    public Map(){
        super(600,600);

        mittelpunktx = 0;
        mittelpunkty = 0;

        drawCircle(150 , 150,30);//1;-1
        drawCircle(300 , 150,30);//1;0
        drawCircle(450 , 150,30);//1;1
        drawCircle(150 , 300,30);//0;-1
        drawCircle(300 , 300,30);//0;0
        drawCircle(450 , 300,30);//0;1
        drawCircle(150 , 450,30);//-1;-1
        drawCircle(300 , 450,30);//-1;0
        drawCircle(450 , 450,30);//-1;1

        drawAirport(1,-1,30);
        drawAirport(1,0,30);
        drawAirport(1,1,30);
        drawAirport(0,-1,30);
        drawAirport(0,0,30);
        drawAirport(0,1,30);
        drawAirport(-1,-1,30);
        drawAirport(-1,0,30);
        drawAirport(-1,1,30);



        setOnMouseClicked(event-> {
            xfirstClick = event.getX();
            yfirstClick = event.getY();
                });

        setOnMouseDragged(event -> {
            xmiddleClick = event.getX();
            ymiddleClick = event.getY();
            deltax = xmiddleClick - xfirstClick;
            deltay = ymiddleClick - yfirstClick;
            mittelpunktx += - deltax / 150;

        });

        setOnMouseReleased(event-> {
            xlastClick = event.getX();
            ylastClick = event.getY();
        });
    }




    public void drawCircle(int mittelpunktx, int mittelpunkty, int radius){
        context.setLineWidth(2.0);
        context.setStroke(Color.BLACK);
        context.setFill(Color.PURPLE);
        context.fillOval(mittelpunktx,mittelpunkty,radius,radius);
    }
    public void drawAirport(int lat, int lon, int radius){
        context.setLineWidth(2.0);
        context.setStroke(Color.BLACK);
        context.setFill(Color.GREEN);
        context.fillOval(300+(lon*150),300-(lat*150),radius,radius);
    }

}
