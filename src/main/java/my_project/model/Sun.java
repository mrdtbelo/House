package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Sun extends GraphicalObject {

    public Sun(double xpos, double ypos,double r){
        x = xpos;
        y = ypos;
        radius = ypos;
    }

    public void draw(DrawTool drawTool){

        drawTool.setCurrentColor(new Color(255, 253, 115));
        drawTool.drawFilledCircle(x+130,y+125,50);
        drawTool.drawLine(x+130,y+125,x+350,y+250);
        drawTool.drawLine(x+130,y+125,x+325,y+100);
        drawTool.drawLine(x+130,y+125,x+560,y+110);
        drawTool.drawLine(x+130,y+125,x+500,y+40);
        drawTool.drawLine(x+130,y+125,x+475,y+250);
        drawTool.drawLine(x+130,y+125,x+400,y+40);
        drawTool.drawLine(x+130,y+125,x+540,y+205);
        drawTool.drawLine(x+130,y+125,x+325,y+160);
    }

    public void update(double dt){
        x = x - 4;

        if(x > 1200){
            x = 200;
        }
    }
}