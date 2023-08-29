package org.system;

import org.system.Car.Car;
import org.system.Decorators.Bumper.LoosenBigBumper;
import org.system.Factories.CarCompanyFactory.CarCompanyFactory;
import org.system.Factories.CarCompanyFactory.FordCarFactory;

public class SystemDriver {
    public static Car getCar(){

        CarCompanyFactory fordCarFactory = new FordCarFactory();
        Car mycar = fordCarFactory.generateCar("SUV", "USA", "1300CC", "Snow", "Tabular", "high-powered", "Red");

        LoosenBigBumper loosenBigBumper = new LoosenBigBumper(mycar);
        Car myCarWithLoosenBigBumper = loosenBigBumper.getCar();

        myCarWithLoosenBigBumper.getDetails();

        return myCarWithLoosenBigBumper;
    }
}
