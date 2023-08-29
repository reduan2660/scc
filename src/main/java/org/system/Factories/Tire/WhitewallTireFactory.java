package org.system.Factories.Tire;

import org.system.Car.Car;

public class WhitewallTireFactory extends TireFactory{
    @Override
    public Car attachTire(Car car) {
        car.tire = new Tire("Whitewall Tire");
        car.price += 5;
        return car;
    }
}
