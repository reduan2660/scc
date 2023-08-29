package org.system.Factories.AC;

import org.system.Car.Car;

public class LowPowerAcFactory extends ACFactory{

    @Override
    public Car attachAC(Car car) {
        car.ac = new AC("Low powered");
        car.price += 5;
        return car;
    }
}
