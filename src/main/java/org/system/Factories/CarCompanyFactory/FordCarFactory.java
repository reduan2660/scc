package org.system.Factories.CarCompanyFactory;

import org.system.Car.*;
import org.system.Factories.AC.ACFactory;
import org.system.Factories.AC.HighPowerAcFactory;
import org.system.Factories.AC.LowPowerAcFactory;
import org.system.Car.*;
import org.system.Factories.Chesis.BackboneChesisFactory;
import org.system.Factories.Chesis.ChesisFactory;
import org.system.Factories.Chesis.LadderFrameChesisFactory;
import org.system.Factories.Chesis.TabularChesisFactory;
import org.system.Factories.Engine.*;
import org.system.Factories.Painting.*;
import org.system.Factories.Tire.*;
import org.system.Factories.Region.AsiaRegionFactory;
import org.system.Factories.Region.RegionFactory;
import org.system.Factories.Region.UsaRegionFactory;

public class FordCarFactory extends CarCompanyFactory {
    public Car orderCar(
            String type,
            String region,
            String engine,
            String tire,
            String chesis,
            String ac,
            String color
    ){
        Car car;

        /* Type */
        if(type == "Private") car = new PrivateCar();
        else if (type == "Racing") car = new RacingCar();
        else if (type == "SUV") car = new SUV();
        else if (type == "Military") car = new Military();
        else car = null;

        /* Company */
        car.bodyDesign = "Ford Design";

        /* Region */
        RegionFactory regionFactory = null;
        if(region == "Asia") regionFactory = new AsiaRegionFactory();
        else if (region == "USA") regionFactory = new UsaRegionFactory();
        car = regionFactory.carRegion(car);

        /* Engine */
        EngineFactory engineFactory = null;
        if(engine == "1300CC")  engineFactory = new CC1300Factory();
        else if(engine == "1700CC")  engineFactory = new CC1700Factory();
        else if(engine == "1800CC")  engineFactory = new CC1800Factory();
        else if(engine == "2100CC")  engineFactory = new CC2100Factory();
        car = engineFactory.attachEngine(car);

       /* Tire */
        TireFactory tireFactory = null;
        if(tire == "Snow") tireFactory = new SnowTireFactory();
        else if(tire == "Spare") tireFactory = new SpareTireFactory();
        else if(tire == "Whitewall") tireFactory = new WhitewallTireFactory();
        else if(tire == "Slick") tireFactory = new SlickTireFactory();
        car = tireFactory.attachTire(car);

        /* Chesis */
        ChesisFactory chesisFactory = null;
        if(chesis == "Tabular") chesisFactory = new TabularChesisFactory();
        else if(chesis == "Backbone") chesisFactory = new BackboneChesisFactory();
        else if(chesis == "Ladder frame") chesisFactory = new LadderFrameChesisFactory();
        car = chesisFactory.attachChesis(car);

        /* AC */
        ACFactory acFactory = null;
        if(ac == "high-powered") acFactory = new HighPowerAcFactory();
        else if(ac == "low-powered") acFactory = new LowPowerAcFactory();
        car = acFactory.attachAC(car);

        /* Color */
        PaintingFactory paintingFactory = null;
        if(color == "Red") paintingFactory = new RedPaintingFactory();
        else if(color == "White") paintingFactory = new WhitePaintingFactory();
        else if(color == "Grey") paintingFactory = new GreyPaintingFactory();
        else if(color == "Black") paintingFactory = new BlackPaintingFactory();
        car = paintingFactory.paintCar(car);

        return car;
    }
}
