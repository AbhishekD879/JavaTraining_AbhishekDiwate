package com.JavaTraining.Day5.Duck;

public class WoodenDuck extends Duck implements Decoratable {

    @Override
    public void decorate() {
        System.out.println("decorating.....");
    }
}
