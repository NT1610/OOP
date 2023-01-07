package com.patterns.strategy;

public class ConcreteStractegyAdd implements Strategy {

    @Override
    public double execute(double a, double b) {
        return a + b;
    }
}
