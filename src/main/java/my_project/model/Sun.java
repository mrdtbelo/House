package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Sun extends GraphicalObject {

    public void draw(DrawTool drawTool){

        drawTool.setCurrentColor(new Color(255, 253, 115));
        drawTool.drawFilledCircle(450,125,50);
        drawTool.drawLine(450,125,350,250);
        drawTool.drawLine(450,125,325,100);
        drawTool.drawLine(450,125,560,110);
        drawTool.drawLine(450,125,500,40);
        drawTool.drawLine(450,125,475,250);
        drawTool.drawLine(450,125,400,40);
        drawTool.drawLine(450,125,540,205);
        drawTool.drawLine(450,125,325,160);
    }
}
