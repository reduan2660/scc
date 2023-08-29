package org.system.Factories.Painting;

import org.system.Car.Car;

public class WhitePaintingFactory extends PaintingFactory{
    @Override
    public Car paintCar(Car car) {
        car.color = "White";
        return car;
    }
}
