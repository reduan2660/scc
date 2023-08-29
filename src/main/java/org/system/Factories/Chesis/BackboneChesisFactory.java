package org.system.Factories.Chesis;

import org.system.Car.Car;

public class BackboneChesisFactory extends ChesisFactory{
    @Override
    public Car attachChesis(Car car) {
        car.chesis = new Chesis("Backbone chesis");
        car.price += 12;
        return car;
    }
}
