package org.system.Factories.Region;

import org.system.Car.Car;

public class AsiaRegionFactory extends RegionFactory{
    @Override
    public Car carRegion(Car car) {
        car.ai  = "AI for Asia.";
        return car;
    }
}
