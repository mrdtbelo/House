package my_project.control;

import KAGO_framework.control.ViewController;
import KAGO_framework.model.abitur.datenstrukturen.Queue;
import my_project.model.*;
import my_project.view.InputManager;

import java.awt.event.MouseEvent;

/**
 * Ein Objekt der Klasse ProgramController dient dazu das Programm zu steuern. Die updateProgram - Methode wird
 * mit jeder Frame im laufenden Programm aufgerufen.
 */
public class ProgramController {

    //Attribute


    // Referenzen
    private ViewController viewController;  // diese Referenz soll auf ein Objekt der Klasse viewController zeigen. Über dieses Objekt wird das Fenster gesteuert.

    /**
     * Konstruktor
     * Dieser legt das Objekt der Klasse ProgramController an, das den Programmfluss steuert.
     * Damit der ProgramController auf das Fenster zugreifen kann, benötigt er eine Referenz auf das Objekt
     * der Klasse viewController. Diese wird als Parameter übergeben.
     * @param viewController das viewController-Objekt des Programms
     */
    public ProgramController(ViewController viewController){
        this.viewController = viewController;
    }

    /**
     * Diese Methode wird genau ein mal nach Programmstart aufgerufen.
     * Sie erstellt die leeren Datenstrukturen, zu Beginn nur eine Queue
     */
    public void startProgram() {
        // Erstelle ein Objekt der Klasse Ball und lasse es zeichnen
        //Ball ball1 = new Ball(150,150);
        //viewController.draw(ball1);

        Background b1 = new Background();
        viewController.draw(b1);

        Sun s1 = new Sun();
        viewController.draw(s1);

        Tree t2 = new Tree(530,350,45);
        viewController.draw(t2);
        Tree t3 = new Tree(260,350,45);
        viewController.draw(t3);
        Tree t4 = new Tree(10,400,45);
        viewController.draw(t4);

        House h1 = new House(320,340);
        viewController.draw(h1);
        House h2 = new House(50,400);
        viewController.draw(h2);

        Tree t1 = new Tree(300,450,45);
        viewController.draw(t1);

        Cloud c1 = new Cloud(100,115,30);
        viewController.draw(c1);
        Cloud c2 = new Cloud(350,210,30);
        viewController.draw(c2);
        Cloud c3 = new Cloud(400,100,15);
        viewController.draw(c3);
        Cloud c4 = new Cloud(250,145,45);
        viewController.draw(c4);
        Cloud c5 = new Cloud(380,122,40);
        viewController.draw(c5);
        Cloud c6 = new Cloud(560,110,30);
        viewController.draw(c6);
        Cloud c7 = new Cloud(10,130,20);
        viewController.draw(c7);
        Cloud c8 = new Cloud(620,83,35);
        viewController.draw(c8);
        Cloud c9 = new Cloud(230,40,20);
        viewController.draw(c9);
        Cloud c10 = new Cloud(110,20,25);
        viewController.draw(c10);

        Path p1 = new Path();
        viewController.draw(p1);
    }

    /**
     * Aufruf mit jeder Frame
     * @param dt Zeit seit letzter Frame
     */
    public void updateProgram(double dt){

    }
}
