package com.tdd;

public class Cab {
    int total = 0;

    public int calculateFare(int km, int time) {

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
}
