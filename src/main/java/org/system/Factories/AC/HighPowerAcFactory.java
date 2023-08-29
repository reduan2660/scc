package org.system.Factories.AC;

import org.system.Car.Car;

public class HighPowerAcFactory extends ACFactory{

    @Override
    public Car attachAC(Car car) {
        car.ac = new AC("High powered");
        car.price += 5;
        return car;
    }
}
