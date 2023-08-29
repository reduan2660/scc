package org.system.Factories.Engine;

import org.system.Car.Car;

public class CC2100Factory extends EngineFactory{

    @Override
    public Car attachEngine(Car car) {
        car.engine = new Engine("2100 CC");
        car.price += 21;
        return car;
    }
}
