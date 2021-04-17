package com.flores.designpatterns.decorator;

public class Espresso extends Beverage{

    private int espressoCost;

    public Espresso(){
        espressoCost = 2;
    }

    @Override
    public int cost() {
        return espressoCost;
    }
}
