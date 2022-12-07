package my_project.model;


import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class House extends GraphicalObject {

    public House(){

    }

    public void draw(DrawTool drawTool){

        // Körper
        drawTool.setCurrentColor(new Color(200, 162, 200));
        drawTool.drawFilledRectangle(320,340,  120, 140);

        // Körperumrandung
        drawTool.setCurrentColor(new Color(0, 0, 0));
        drawTool.drawRectangle(320,340,120,140);

        // Schornstein
        drawTool.setCurrentColor(new Color(81, 86, 92));

        // Dach
        drawTool.setCurrentColor(new Color(46, 8, 43));
        drawTool.drawFilledTriangle(320, 340, 440, 340, 380, 245);

        // Dachumrandung
        drawTool.setCurrentColor(new Color(0, 0, 0));
        drawTool.drawTriangle(320,340,440,340,380,245);

        // Tür
        drawTool.setCurrentColor(new Color(0, 0, 0));
        drawTool.drawFilledRectangle(330,440, 20, 40);

        // Fenster
        drawTool.setCurrentColor(new Color(156, 146, 146));
        drawTool.drawFilledRectangle(340,365, 25, 30);
        drawTool.drawFilledRectangle(390,365, 25, 30);

        // Fensterumrandungen
        drawTool.setCurrentColor(new Color(0, 0, 0));
        drawTool.drawRectangle(340,365,25, 30);
        drawTool.drawRectangle(390,365,25, 30);

        // Fensterkeruze
        drawTool.drawLine(340,380,365,380);
        drawTool.drawLine(352.5,365,352.5,395);
        drawTool.drawLine(390,380,415,380);
        drawTool.drawLine(402.5,365,402.5,395);

        // Türknauf
        drawTool.setCurrentColor(new Color(255, 255, 255));



       
    }
}
