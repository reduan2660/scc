package org.system.Decorators.RainShield;

import org.system.Car.Car;
import org.system.Decorators.GateControl.GateControlDecorator;

public class ThinRainShield extends GateControlDecorator {
    Car car;
    public ThinRainShield(Car car){
        this.car = car;
        car.decorations += " | Thin Rain Shield | ";
        car.price += 15;
    }

    public Car getCar() {
        return car;
    }
}
