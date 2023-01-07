package com.patterns.strategy;

public class ConcreteStractegySubtract implements Strategy {
    @Override
    public double execute(double a, double b) {
        return a - b;
    }
}
