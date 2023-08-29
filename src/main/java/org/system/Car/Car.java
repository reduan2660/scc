package org.system.Car;

import org.system.Factories.AC.AC;
import org.system.Factories.Chesis.Chesis;
import org.system.Factories.Engine.Engine;
import org.system.Factories.Tire.Tire;

public abstract class Car {
    public String type;
    public Engine engine;
    public Tire tire;
    public Chesis chesis;
    public AC ac;
    public String color;
    public double price;
    public Integer seat;
    public String bodyDesign;
    public String ai;

    public String decorations = "";
    public void manufacture(){
        System.out.println("Manufacturing Car: ");
//        System.out.println("engine = " + engine.spec);
//        System.out.println("tire = " + tire.spec);
//        System.out.println("chesis = " + chesis.spec);
//        System.out.println("ac = " + ac.spec);
//        System.out.println("color = " + color);
//        System.out.println("bodyDesign = " + bodyDesign);
//        System.out.println("ai = " + ai);
//        System.out.println("seat = " + seat);
//        System.out.println("price = " + price);
    }


    public void getDetails(){
        System.out.println("Details of Car: ");
        System.out.println("engine = " + engine.spec);
        System.out.println("tire = " + tire.spec);
        System.out.println("chesis = " + chesis.spec);
        System.out.println("ac = " + ac.spec);
        System.out.println("color = " + color);
        System.out.println("bodyDesign = " + bodyDesign);
        System.out.println("ai = " + ai);
        System.out.println("seat = " + seat);
        System.out.println("price = " + price);
        System.out.println("decorations = " + decorations);
    }

}
