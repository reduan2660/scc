package org.system.Notifications.Observables;

import java.util.Observable;

public class CarFeature extends Observable {
    private String featureDescription;

    public void featureChanged(String featureDescription){
        setChanged();
        notifyObservers();
    }

    public String getFeatureDescription() {
        return featureDescription;
    }

    public void setFeatureDescription(String featureDescription) {
        this.featureDescription = featureDescription;
        featureChanged(featureDescription);
    }
}
