package my_project.model;


import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class House extends GraphicalObject {

    public House(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void draw(DrawTool drawTool){
        //Außenwand
        drawTool.setCurrentColor(new Color(255, 153, 153));
        drawTool.drawFilledRectangle(x,y,200,165);
        drawTool.setCurrentColor(new Color(0, 0, 0));
        drawTool.drawRectangle(x,y,200,165);

        drawTool.setCurrentColor(new Color(211, 194, 194));
        drawTool.drawFilledRectangle(x-3,y+145,205,25);
        drawTool.setCurrentColor(new Color(0, 0, 0));
        drawTool.drawRectangle(x-3,y+145,205,25);

        drawTool.setCurrentColor(new Color(211, 194, 194));
        drawTool.drawFilledRectangle(x,y+5,200,15);
        drawTool.setCurrentColor(new Color(0, 0, 0));
        drawTool.drawRectangle(x,y+5,200,15);

        //Schornstein
        drawTool.setCurrentColor(new Color(46,8,43));
        drawTool.drawFilledRectangle(x+10,y-80,30,70);
        drawTool.setCurrentColor(new Color(0, 0, 0));
        drawTool.drawRectangle(x+10,y-80,30,70);

        //Dach
        drawTool.setCurrentColor(new Color(195, 33, 72));
        drawTool.drawFilledTriangle(x-10,y+5,x+210,y+5,x+95,y-110);
        drawTool.setCurrentColor(new Color(0, 0, 0));
        drawTool.drawTriangle(x-10,y+5,x+210,y+5,x+95,y-110);

        //Tür
        drawTool.setCurrentColor(new Color(222, 93, 131));
        drawTool.drawFilledRectangle(x+75,y+50,50,120);
        drawTool.setCurrentColor(new Color(0, 0, 0));

        drawTool.drawRectangle(x+75,y+50,50,120);
        drawTool.setCurrentColor(new Color(170, 152, 169));
        drawTool.drawFilledRectangle(x+83,y+60,37,50);
        drawTool.drawFilledRectangle(x+83,y+115,37,50);
        drawTool.setCurrentColor(new Color(0, 0, 0));
        drawTool.drawRectangle(x+83,y+60,37,50);
        drawTool.drawRectangle(x+83,y+115,37,50);

        drawTool.setCurrentColor(new Color(210, 180, 180));
        drawTool.drawFilledCircle(x+80,y+113,2.5);
        drawTool.setCurrentColor(new Color(0, 0, 0));
        drawTool.drawCircle(x+80,y+113,2.5);

        //Fenster
        drawTool.setCurrentColor(new Color(170, 152, 169));
        drawTool.drawFilledRectangle(x+15,y+50,50,60);
        drawTool.setCurrentColor(new Color(0, 0, 0));
        drawTool.drawRectangle(x+15,y+50,50,60);

        drawTool.setCurrentColor(new Color(170, 152, 169));
        drawTool.drawFilledRectangle(x+135,y+50,50,60);
        drawTool.setCurrentColor(new Color(0, 0, 0));
        drawTool.drawRectangle(x+135,y+50,50,60);

        drawTool.setCurrentColor(new Color(170, 152, 169));
        drawTool.drawFilledRectangle(x+60,y-50,80,40);
        drawTool.setCurrentColor(new Color(0, 0, 0));
        drawTool.drawRectangle(x+60,y-50,80,40);

        //Fensterkreuze
        drawTool.setCurrentColor(new Color(0, 0, 0));
        drawTool.drawLine(x+15,y+65,x+65,y+65);
        drawTool.drawLine(x+40,y+65,x+40,y+110);

        drawTool.drawLine(x+135,y+65,x+185,y+65);
        drawTool.drawLine(x+160,y+65,x+160,y+110);

        drawTool.drawLine(x+60,y-35,x+140,y-35);
        drawTool.drawLine(x+100,y-35,x+100,y-10);



    }
}