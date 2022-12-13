package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Path extends GraphicalObject {

    public void draw(DrawTool drawTool){
        drawTool.setCurrentColor(new Color(119, 103, 103));
        drawTool.drawFilledRectangle(390,510,60,120);

     }
}
