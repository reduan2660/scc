package org.system.Notifications.Observers;

import org.system.Notifications.Observables.CarPrice;

import java.util.Observable;
import java.util.Observer;

public class CarPriceObserver implements Observer {
    private double roofPrice, tirePrice;
    @Override
    public void update(Observable obs, Object arg) {
        if(obs instanceof CarPrice){
            this.roofPrice = ((CarPrice) obs).getRoofPrice();
            this.tirePrice = ((CarPrice) obs).getTirePrice();
        }

        notifyUpdate();
    }

    public void notifyUpdate(){
        System.out.println("PRICE UPDATE: ");
        System.out.println("roofPrice = " + roofPrice);
        System.out.println("tirePrice = " + tirePrice);
    }
}
