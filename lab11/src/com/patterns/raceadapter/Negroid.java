package com.patterns.raceadapter;

public class Negroid{

    String skinColor = "Black";
    String eye = "Black";

    public Negroid() {
    }

    public String getSkinColor() {
        return skinColor;
    }

    public String getEye() {
        return eye;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public void setEye(String eye) {
        this.eye = eye;
    }

    @Override
    public String toString() {
        return "Negroid{" +
                "skinColor='" + skinColor + '\'' +
                ", eye='" + eye + '\'' +
                '}';
    }
}
