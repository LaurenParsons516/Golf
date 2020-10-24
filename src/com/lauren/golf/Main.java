package com.lauren.golf;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GolfClub club1 = new GolfClub("putter", 20);
        GolfClub club2 = new GolfClub("SW", 70);
        GolfClub club3 = new GolfClub("GW", 90);
        GolfClub club4 = new GolfClub("PW", 100);
        GolfClub club5 = new GolfClub("9 Iron", 115);
        GolfClub club6 = new GolfClub("8 Iron", 130);
        GolfClub club7 = new GolfClub("7 Iron", 140);
        GolfClub club8 = new GolfClub("6 Iron", 150);
        GolfClub club9 = new GolfClub("5 Iron", 160);
        GolfClub club10 = new GolfClub("4 Iron", 170);
        GolfClub club11 = new GolfClub("3 Iron", 180);
        GolfClub club12 = new GolfClub("3 Wood", 200);
        GolfClub club13 = new GolfClub("Driver", 230);

        club1.displayReasonably();

        GolfBag bag1 = new GolfBag();

        bag1.addGolfClub(club1);
        bag1.addGolfClub(club2);
        bag1.addGolfClub(club3);
        bag1.addGolfClub(club4);
        bag1.addGolfClub(club5);
        bag1.addGolfClub(club6);
        bag1.addGolfClub(club7);
        bag1.addGolfClub(club8);
        bag1.addGolfClub(club9);
        bag1.addGolfClub(club10);
        bag1.addGolfClub(club11);
        bag1.addGolfClub(club12);
        bag1.addGolfClub(club13);

        Scanner answer = new Scanner((System.in));
        System.out.println("Enter distance: ");

        int numSwaps;
        do {
            numSwaps = 0;
            for (int i = 0; i < bag1.getGolfClubs().size() - 1; i++) {
                GolfClub temp;
                if (bag1.getGolfClubs().get(i).getDistance() > bag1.getGolfClubs().get(i + 1).getDistance()) {
                    temp = bag1.getGolfClubs().get(i);
                    bag1.getGolfClubs().set(i, bag1.getGolfClubs().get(i + 1));
                    bag1.getGolfClubs().set(i + 1, temp);
                    numSwaps++;

                }
            }
        } while (numSwaps > 0);
        int userDistance = answer.nextInt();
        GolfClub closestClub = null;


        for (int i = 0; i < bag1.getGolfClubs().size(); i++) {
            if (userDistance < bag1.getGolfClubs().get(i).getDistance()) {
                System.out.println(bag1.getGolfClubs().get(i - 1).getName());
                break;
            }
        }
    }
}

