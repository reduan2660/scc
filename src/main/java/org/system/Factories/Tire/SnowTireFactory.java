package org.system.Factories.Tire;

import org.system.Car.Car;

public class SnowTireFactory extends TireFactory{
    @Override
    public Car attachTire(Car car) {
        car.tire = new Tire("Snow Tire");
        car.price += 3;
        return car;
    }
}
