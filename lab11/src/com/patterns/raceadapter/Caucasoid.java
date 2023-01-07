package com.patterns.raceadapter;

public class Caucasoid implements Person {

    private String color = "White";
    private String eye = "Blue";

    public String getColor() {
        return color;
    }

    public String getEye() {
        return eye;
    }

    @Override
    public void color() {
        System.out.println(this.color);
    }

    @Override
    public void eye() {
        System.out.println(this.eye);
    }
}
