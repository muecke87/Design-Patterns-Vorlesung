package com.adapter;

public class SquarePegAdapter extends RoundPeg{

    SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    public double getRadius() {
        return (Math.sqrt(Math.pow((squarePeg.getWidth() / 2), 2) * 2));
    }
}
