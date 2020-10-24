package com.lauren.golf;

import java.util.ArrayList;

public class GolfBag {
    private ArrayList<GolfClub> heldGolfClubs = new ArrayList<GolfClub>();

    public void addGolfClub(GolfClub club) {
        heldGolfClubs.add(club);
    }

    public ArrayList<GolfClub> getGolfClubs() {
        return heldGolfClubs;
    }

}
