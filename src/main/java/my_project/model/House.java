package my_project.model;


import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class House extends GraphicalObject {

    public House(double x, double y, int height, int width){
        this.x = x;
        this.y = y;

    }
    // height = 140
    // width = 120
    // y = 340

    public void draw(DrawTool drawTool){

        // Mauer
        drawTool.setCurrentColor(new Color(200, 162, 200));
        drawTool.drawFilledRectangle(x,y,  120, 140);

        // Mauerumrandung
        drawTool.setCurrentColor(new Color(0, 0, 0));
        drawTool.drawRectangle(x,y,120,140);

        // Schornstein
        drawTool.setCurrentColor(new Color(81, 86, 92));

        // Dach
        drawTool.setCurrentColor(new Color(46, 8, 43));
        drawTool.drawFilledTriangle(x, y, x+120, y, x+60, y-95);

        // Dachumrandung
        drawTool.setCurrentColor(new Color(0, 0, 0));
        drawTool.drawTriangle(x,y,x+120,y,x+60,y-95);

        // Tür
        drawTool.setCurrentColor(new Color(0, 0, 0));
        drawTool.drawFilledRectangle(x+10,y+100, 20, 40);

        // Fenster
        drawTool.setCurrentColor(new Color(156, 146, 146));
        drawTool.drawFilledRectangle(x+20,y+25, 25, 30);
        drawTool.drawFilledRectangle(x+70,y+25, 25, 30);

        // Fensterumrandungen
        drawTool.setCurrentColor(new Color(0, 0, 0));
        drawTool.drawRectangle(x+20,y+25,25, 30);
        drawTool.drawRectangle(x+70,y+25,25, 30);

        // Fensterkreuze
        drawTool.drawLine(x+20,y+40,x+45,y+40);
        drawTool.drawLine(x+32.5,y+25,x+32.5,y+55);
        drawTool.drawLine(x+70,y+40,x+95,y+40);
        drawTool.drawLine(x+82.5,y+25,x+82.5,y+55);

        // Türknauf
        drawTool.setCurrentColor(new Color(255, 255, 255));
        drawTool.drawFilledCircle(x+26,y+120,1.5);



       
    }
}
