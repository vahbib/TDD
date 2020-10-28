package com.tdd;

public class Cab {

    int total = 0;
    int noOfRides = 0;

    public int calculateFare(int km, int time) {
        noOfRides++;
        int t = time + (10 * km);
        int n = t;
        if (n <= 5) {
            t = 5;
            total = total + t;
        } else {
            total = total + t;
        }
        return total;
    }

    public double AvgFare() {
       double avgFare = (double) total / (double) noOfRides;
       return avgFare;
    }
}
