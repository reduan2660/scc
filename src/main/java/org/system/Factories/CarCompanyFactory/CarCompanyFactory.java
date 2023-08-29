package org.system.Factories.CarCompanyFactory;

import org.system.Car.Car;

public abstract class CarCompanyFactory {
    public abstract Car orderCar(
            String type,
            String region,
            String engine,
            String tire,
            String chesis,
            String ac,
            String color
    );

    public Car generateCar(
            String type,
            String region,
            String engine,
            String tire,
            String chesis,
            String ac,
            String color
    ){
        Car car = orderCar(type, region, engine, tire, chesis, ac, color);
        car.manufacture();
        return car;
    }
}
