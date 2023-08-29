package org.system.Factories.Engine;

import org.system.Car.Car;

public class CC1700Factory extends EngineFactory{

    @Override
    public Car attachEngine(Car car) {
        car.engine = new Engine("1700 CC");
        car.price += 17;
        return car;
    }
}
