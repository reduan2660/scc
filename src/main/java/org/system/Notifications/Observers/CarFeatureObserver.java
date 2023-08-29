package org.system.Notifications.Observers;

import org.system.Notifications.Observables.CarFeature;
import org.system.Notifications.Observables.CarPrice;

import java.util.Observable;
import java.util.Observer;

public class CarFeatureObserver implements Observer {
    private String carFeature;
    @Override
    public void update(Observable obs, Object arg) {
        if(obs instanceof CarFeature){
            this.carFeature = ((CarFeature) obs).getFeatureDescription();
        }
        notifyUpdate();
    }

    public void notifyUpdate(){
        System.out.println("FEATURE UPDATE: ");
        System.out.println("carFeature = " + carFeature);
    }
}
