package com.flores.designpatterns.decorator;

public class Caramel extends AddonDecorator{

    Beverage beverage;
    private int caramelCost;
    public Caramel(Beverage beverage){
        this.beverage = beverage;
        caramelCost = 2;
    }

    @Override
    public int cost() {
       return this.beverage.cost()+caramelCost;
    }
}
