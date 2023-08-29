package org.system.Factories.Painting;

import org.system.Car.Car;

public class GreyPaintingFactory extends PaintingFactory{
    @Override
    public Car paintCar(Car car) {
        car.color = "Grey";
        return car;
    }
}
