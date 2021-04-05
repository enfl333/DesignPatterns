package com.flores.designpatterns.observerpattern;

import java.util.ArrayList;
import java.util.List;

/***
 * Concrete implementation of the IObservable interface part of the
 * Observer Pattern.
 *
 */
public class WeatherStation implements IObservable{

    List<IObserver> iObservers;
    Double temperature;


    public WeatherStation(){
        iObservers = new ArrayList<IObserver>();
        temperature = Double.valueOf(0.0);
    }

    @Override
    public void add(IObserver observer) {
        iObservers.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        iObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer:iObservers) {
            System.out.println("Notifying observers");
            observer.update();
        }
    }

    public void setTemperature(Double temp){
        this.temperature = temp;
        notifyObservers();
    }

    public Double getTemperature(){
       return this.temperature;
    }

}
