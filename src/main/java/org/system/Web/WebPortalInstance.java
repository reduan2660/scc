package org.system.Web;

import org.system.SystemDriver;

public class WebPortalInstance {
    public static void main(String[] args) {
        WebPortal webPortal = WebPortal.getWebPortal();
        webPortal.buyCarOnline(SystemDriver.getCar());
        webPortal.carWash();
    }
}
