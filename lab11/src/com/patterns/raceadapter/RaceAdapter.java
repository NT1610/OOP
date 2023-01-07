package com.patterns.raceadapter;

public class RaceAdapter extends Caucasoid {

    Negroid negroid = new Negroid();

    public RaceAdapter(Negroid negroid) {
        this.negroid = negroid;
    }

    @Override
    public void color() {
        Caucasoid caucasoid = new Caucasoid();
        negroid.setSkinColor( caucasoid.getColor());
    }

    @Override
    public void eye() {
        Caucasoid caucasoid = new Caucasoid();
        negroid.setEye(caucasoid.getEye());
    }
}
