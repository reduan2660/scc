package org.system.MobileApp;

import org.system.Car.Car;
import org.system.Web.Portal;
import org.system.Web.WebPortal;
import org.system.Web.WebPortalInstance;

public class MobileAppAdapter extends WebPortalInstance implements Portal {


    @Override
    public void carService() {
        System.out.println("Car Service Received From Mobile App Adapter");
    }

    @Override
    public void carWash() {
        System.out.println("Car Wash Received From Mobile App Adapter");
    }

    @Override
    public void buyCarOnline(Car car) {
        System.out.println("Car Order Received From Mobile App Adapter");
        car.getDetails();
    }
}
