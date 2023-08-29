package org.system.Factories.Chesis;

import org.system.Car.Car;

public class LadderFrameChesisFactory extends ChesisFactory{
    @Override
    public Car attachChesis(Car car) {
        car.chesis = new Chesis("Ladder Frame chesis");
        car.price += 15;
        return car;
    }
}
