package org.system;

import org.system.Car.Car;

public class Main {
    public static void main(String[] args) {

        Car myCar = SystemDriver.getCar();
        myCar.getDetails();
    }
}