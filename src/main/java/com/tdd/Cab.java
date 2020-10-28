package com.tdd;

import java.util.ArrayList;
import java.util.HashMap;


class Invoice{
    public int total;
    public int noOfRides;
    public String Id;
    public double averageFare;

    Invoice() {

    }

    Invoice(String Id,int total, int noOfRides, double averageFare)
    {
        this.Id=Id;
        this.total=total;
        this.noOfRides=noOfRides;
        this.averageFare=averageFare;
    }

    @Override
    public String toString()
    {
        return "UserId : " + Id + "\nTotal Fare : " + total +
                "\nTotal number of Rides: " + noOfRides + "\nAverage Amount : " + averageFare;
    }
}

public class Cab {


    int total = 0;
    int noOfRides = 0;
    public HashMap<String, ArrayList<Integer>> rides = new HashMap<>();
    public ArrayList<Integer> fareDetails;

    public enum type {
        NORMAL,
        PREMIUM
    }

    public void FareDetail(String Id, type rideType,  int km, int time) {
        if (rideType == type.NORMAL) {

            int f = calculateFareNormal(km, time);
            System.out.println("\nFare: " + f);
            noOfRides++;
            ArrayList<Integer> rideDet = new ArrayList<>();
            if (rides.containsKey(Id)) {
                rideDet = rides.get(Id);
            }
            rideDet.add(f);
            rides.put(Id, rideDet);
            System.out.println(rides);
        } else if (rideType == type.PREMIUM) {

            int f = calculateFarePremium(km, time);
            System.out.println("\nFare: " + f);
            noOfRides++;
            ArrayList<Integer> rideDet = new ArrayList<>();
            if (rides.containsKey(Id)) {
                rideDet = rides.get(Id);
            }
            rideDet.add(f);
            rides.put(Id, rideDet);
            System.out.println(rides);

        }
    }

    public Invoice RideRepo(String Id) {
        fareDetails = rides.get(Id);
        int totalFare = 0;
        for (int fare: fareDetails) {
            totalFare = totalFare +fare;
        }
        int totalRides = fareDetails.size();
        double avg = (double)totalFare/(double)totalRides;
        return new Invoice(Id, totalFare,totalRides,avg);
    }



    public int calculateFareNormal(int km, int time) {
        int t = time + (10 * km);
        int n = t;
        if (n <= 5) {
            t = 5;
        }
        total = t;
        return total;
    }
    public int calculateFarePremium(int km, int time) {
        int t = (2*time) + (15 * km);
        int n = t;
        if (n <= 20) {
            t = 20;
        }
        total = t;
        return total;
    }


}