package org.system.Factories.Tire;

import org.system.Car.Car;

public class SlickTireFactory extends TireFactory{
    @Override
    public Car attachTire(Car car) {
        car.tire = new Tire("Slick Tire");
        car.price += 6;
        return car;
    }
}
