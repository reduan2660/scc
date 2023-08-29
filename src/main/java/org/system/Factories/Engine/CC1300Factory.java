package org.system.Factories.Engine;

import org.system.Car.Car;

public class CC1300Factory extends EngineFactory{

    @Override
    public Car attachEngine(Car car) {
        car.engine = new Engine("1300 CC");
        car.price += 13;
        return car;
    }
}
