package org.system.Decorators.GateControl;

import org.system.Car.Car;

public class MobileAppGateControl extends GateControlDecorator {
    Car car;
    public MobileAppGateControl(Car car){
        this.car = car;
        car.decorations += " | Mobile App Gate Control | ";
        car.price += 15;
    }

    public Car getCar() {
        return car;
    }
}
