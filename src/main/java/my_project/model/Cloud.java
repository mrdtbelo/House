package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Cloud extends GraphicalObject {

    public Cloud(double xPos,double yPos, double r){
        x = xPos;
        y = yPos;
        radius = r;
    }

    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(new Color(200,200,200));
        drawTool.drawFilledCircle(x,y,radius);
        drawTool.drawFilledCircle(x+radius/2,y+radius/2,radius);
        drawTool.drawFilledCircle(x+radius,y,radius);

    }

    /**
     * update wird in einer Sekunde mehrmals aufgerufen (ungefähr 28 mal).
     * Zwischen jedem Aufruf wird die Zeit, die seit dem letzten Aufruf vergangen ist, gemessen und als dt an die Methode übergeben.
     * @param dt
     */
    public void update(double dt){
        x = x + 100*(radius/100)*dt; //eine Wolke soll sich mit 100 Pixeln / Sekunde nach rechts bewegen

        if(x > 1200){
            x = -200;
        }

        //y = y + 20*dt;
    }

}
