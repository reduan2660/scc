package org.system.Factories.Painting;

import org.system.Car.Car;

public class BlackPaintingFactory extends PaintingFactory{
    @Override
    public Car paintCar(Car car) {
        car.color = "Black";
        return car;
    }
}
