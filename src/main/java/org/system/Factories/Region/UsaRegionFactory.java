package org.system.Factories.Region;

import org.system.Car.Car;

public class UsaRegionFactory extends RegionFactory{
    @Override
    public Car carRegion(Car car) {
        car.ai  = "AI for usa.";
        return car;
    }
}
