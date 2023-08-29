package org.system.Decorators.Bumper;

import org.system.Car.Car;

public class TightSmallBumper extends BumperDecorator{
    Car car;
    public TightSmallBumper(Car car){
        this.car = car;
        car.decorations += " | Tight Small Bumper | ";
        car.price += 10;
    }

    @Override
    public Car getCar() {
        return car;
    }
}
