package org.system.Factories.Tire;

import org.system.Car.Car;

public class SpareTireFactory extends TireFactory{
    @Override
    public Car attachTire(Car car) {
        car.tire = new Tire("Spare Tire");
        car.price += 4;
        return car;
    }
}
