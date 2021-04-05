package com.flores.designpatterns.observerpattern;

public class WindowDisplay implements IObserver, IDisplay{

    private WeatherStation weatherStation;
    private Double displayTemperature;

    public WindowDisplay(WeatherStation weatherStation){
        this.weatherStation = weatherStation;
        displayTemperature = Double.valueOf(0.0);
    }
    @Override
    public void update() {
        setDisplayTemperature(weatherStation.getTemperature());
        System.out.println("Temperature in WindowDisplay: "+getDisplayTemperature());
    }

    @Override
    public void display() {
        System.out.println("-------------Window-------------------------");
        System.out.println("------[*****************************]-------");
        System.out.println("------[*<"+getDisplayTemperature()+">*]-----");
        System.out.println("------[*****************************]-------");
        System.out.println("--------------------------------------------");
        System.out.println("");
    }

    public Double getDisplayTemperature() {
        return displayTemperature;
    }

    public void setDisplayTemperature(Double displayTemperature) {
        this.displayTemperature = displayTemperature;
    }
}
