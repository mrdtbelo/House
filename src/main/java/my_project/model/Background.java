package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Background extends GraphicalObject {

    public void Background(){

    }
    public void draw(DrawTool drawTool){

        //Himmel
        drawTool.setCurrentColor(new Color(143, 182, 222));
        drawTool.drawFilledRectangle(0,0,1000,450);
        drawTool.setCurrentColor(new Color(65, 87, 62));
        drawTool.drawFilledRectangle(0,450,1000,900);

    }
}
