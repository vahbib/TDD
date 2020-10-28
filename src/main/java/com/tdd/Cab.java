package com.tdd;

import java.util.ArrayList;
import java.util.HashMap;


class Invoice{
    public int total;
    public int noOfRides;
    private String Id;
    public double averageFare;

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

    public void FareDetail(String Id, int km, int time) {
        int f = calculateFare(km, time);
        System.out.println("\nFare: " +f);
        noOfRides++;
        ArrayList<Integer> rideDet = new ArrayList<>();
        if (rides.containsKey(Id)) {
            rideDet = rides.get(Id);
        }
        rideDet.add(f);
        rides.put(Id, rideDet);
        System.out.println(rides);
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



    public int calculateFare(int km, int time) {
        int t = time + (10 * km);
        int n = t;
        if (n <= 5) {
            t = 5;
        }
        total = t;
        return total;
    }

}