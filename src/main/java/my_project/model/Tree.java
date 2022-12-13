package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Tree extends GraphicalObject {

    public Tree(int x, int y,int r){
        this.x = x;
        this.y = y;
        radius = r;
    }
    public void draw(DrawTool drawTool){
        drawTool.setCurrentColor(new Color(56, 40, 33));
        drawTool.drawFilledRectangle(x,y,40,120);
        drawTool.setCurrentColor(new Color(169, 64, 100));
        drawTool.drawFilledCircle(x,y,radius);
        drawTool.drawFilledCircle(x+radius/2,y+radius/2,radius);
        drawTool.drawFilledCircle(x+radius,y,radius);
    }
}
