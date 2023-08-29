package org.system.MobileApp;

import org.system.SystemDriver;

public class MobileApp {
    public static void main(String[] args) {
        MobileAppAdapter mobileAppAdapter = new MobileAppAdapter();
        mobileAppAdapter.buyCarOnline(SystemDriver.getCar());
        mobileAppAdapter.carWash();
    }
}
