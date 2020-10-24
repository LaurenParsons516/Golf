package com.lauren.golf;

public class GolfClub {
    private String name;
    private int distance;

    public GolfClub(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public void displayReasonably() {
        System.out.println("Name of golf club: " + name + "\nDistance the ball travels with this club: " + distance);
    }

    public int getDistance() {
        return distance;
    }

    public String getName() {
        return name;
    }
}
