package org.system.Notifications.Observables;

import java.util.Observable;

public class CarPrice extends Observable {
    private double roofPrice, tirePrice;

    public void priceChanged(double roofPrice, double tirePrice){
        setChanged();
        notifyObservers();
    }

    public void setRoofPrice(double roofPrice) {
        this.roofPrice = roofPrice;
        priceChanged(roofPrice, this.tirePrice);
    }

    public void setTirePrice(double tirePrice) {
        this.tirePrice = tirePrice;
        priceChanged(this.roofPrice, tirePrice);
    }

    public double getRoofPrice() {
        return roofPrice;
    }

    public double getTirePrice() {
        return tirePrice;
    }
}
