package org.system.Web;

import org.system.Car.Car;

public class WebPortal implements Portal{
    private static WebPortal webPortal;
    private WebPortal(){};

    public static WebPortal getWebPortal(){
        if(webPortal == null){
            webPortal = new WebPortal();
        }
        return webPortal;
    }

    public void carService(){
        System.out.println("Car service request received.");
    }

    public void carWash(){
        System.out.println("Car wash request received.");
    }

    public void buyCarOnline(Car car){
        System.out.println("Car order received.");
        car.getDetails();
    }
}
