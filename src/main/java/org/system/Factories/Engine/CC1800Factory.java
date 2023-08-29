package org.system.Factories.Engine;

import org.system.Car.Car;

public class CC1800Factory extends EngineFactory{

    @Override
    public Car attachEngine(Car car) {
        car.engine = new Engine("1800 CC");
        car.price += 18;
        return car;
    }
}
