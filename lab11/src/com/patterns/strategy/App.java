package com.patterns.strategy;

public class App {
    public static void main(String[] args) {
        Context context = new Context();
        int strategyId = 1;
        if (strategyId == 1) {
            context.setStrategy(new ConcreteStractegyAdd());
        } else if (strategyId == 2) {
            context.setStrategy(new ConcreteStractegyMultiply());
        } else {
            context.setStrategy(new ConcreteStractegySubtract());
        }
        System.out.println(context.executeStractegy(2, 3));
    }
}
