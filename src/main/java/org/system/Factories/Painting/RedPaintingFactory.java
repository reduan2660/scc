package org.system.Factories.Painting;

import org.system.Car.Car;

public class RedPaintingFactory extends PaintingFactory{
    @Override
    public Car paintCar(Car car) {
        car.color = "Red";
        return car;
    }
}
