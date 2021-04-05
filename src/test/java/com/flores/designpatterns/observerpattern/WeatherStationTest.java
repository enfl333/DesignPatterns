package com.flores.designpatterns.observerpattern;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WeatherStationTest {

    @Test
    public void testNotifyObservers() {
        WeatherStation station = new WeatherStation();

        PhoneDisplay phoneDisplay = new PhoneDisplay(station);
        WindowDisplay windowDisplay = new WindowDisplay(station);
        station.add(phoneDisplay);
        station.add(windowDisplay);
        Double temp1 = Double.valueOf(10.0);
        //Weather sensors report 10 degree celsius in temperature
        station.setTemperature(temp1);
        // Displays get notification and are updated
        phoneDisplay.display();
        windowDisplay.display();
        Assert.assertEquals(temp1,phoneDisplay.getDisplayTemperature(),
                "Expected the same temperature to be displayed in both" +
                        " the weather station and the Phone Display.");
        Assert.assertEquals(temp1,windowDisplay.getDisplayTemperature(),
                "Expected the same temperature to be displayed in both" +
                        " the weather station and the Window Display.");
        //Weather sensors report 14 degree celsius in temperature
        Double temp2 = Double.valueOf(14.0);
        station.setTemperature(temp2);
        // Displays get notification and are updated
        phoneDisplay.display();
        windowDisplay.display();
        Assert.assertEquals(temp2,phoneDisplay.getDisplayTemperature(),
                "Expected the same temperature to be displayed in both" +
                        " the weather station and the Phone Display.");
        Assert.assertEquals(temp2,windowDisplay.getDisplayTemperature(),
                "Expected the same temperature to be displayed in both" +
                        " the weather station and the Window Display.");

    }
}