package org.system.Decorators.GateControl;

import org.system.Car.Car;
import org.system.Decorators.Bumper.BumperDecorator;

public class RemoteGateControl extends GateControlDecorator {
    Car car;
    public RemoteGateControl(Car car){
        this.car = car;
        car.decorations += " | Remote Gate Control | ";
        car.price += 15;
    }

    public Car getCar() {
        return car;
    }
}
