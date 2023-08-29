package org.system.Factories.Chesis;

import org.system.Car.Car;

public class TabularChesisFactory extends ChesisFactory{
    @Override
    public Car attachChesis(Car car) {
        car.chesis = new Chesis("Tabular chesis");
        car.price += 10;
        return car;
    }
}
