package org.system.Decorators.RainShield;

import org.system.Car.Car;
import org.system.Decorators.GateControl.GateControlDecorator;

public class CurvedRainShield extends GateControlDecorator {
    Car car;
    public CurvedRainShield(Car car){
        this.car = car;
        car.decorations += " | Curved Rain Shield | ";
        car.price += 20;
    }

    public Car getCar() {
        return car;
    }
}
