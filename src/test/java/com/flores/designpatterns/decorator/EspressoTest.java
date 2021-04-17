package com.flores.designpatterns.decorator;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class EspressoTest {

    @Test
    public void testDecorator(){
        Espresso espresso = new Espresso();
        Caramel caramel = new Caramel(espresso);
        System.out.println("Espresso with caramel: "+caramel.cost());
    }
}