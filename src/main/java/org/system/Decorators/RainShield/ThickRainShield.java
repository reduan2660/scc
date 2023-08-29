package org.system.Decorators.RainShield;

import org.system.Car.Car;
import org.system.Decorators.GateControl.GateControlDecorator;

public class ThickRainShield extends GateControlDecorator {
    Car car;
    public ThickRainShield(Car car){
        this.car = car;
        car.decorations += " | Thick Rain Shield | ";
        car.price += 15;
    }

    public Car getCar() {
        return car;
    }
}
