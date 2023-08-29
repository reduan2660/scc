package org.system.Decorators.Roof;

import org.system.Car.Car;
import org.system.Decorators.GateControl.GateControlDecorator;

public class OpenRoof extends GateControlDecorator {
    Car car;
    public OpenRoof(Car car){
        this.car = car;
        car.decorations += " | Open Roof | ";
        car.price += 20;
    }

    public Car getCar() {
        return car;
    }
}
