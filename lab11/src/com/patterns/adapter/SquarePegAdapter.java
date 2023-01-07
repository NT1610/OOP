package com.patterns.adapter;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        super(squarePeg.getWidth());
        this.peg = peg;
    }

    public double getRadix() {
        return peg.getWidth() * Math.sqrt(2) / 2;
    }
}
