package org.system.Decorators.Bumper;

import org.system.Car.Car;

public class LoosenBigBumper extends BumperDecorator{
    Car car;
    public LoosenBigBumper(Car car){
        this.car = car;
        car.decorations += " | Loosen Big Bumper | ";
        car.price += 15;
    }

    public Car getCar() {
        return car;
    }
}
