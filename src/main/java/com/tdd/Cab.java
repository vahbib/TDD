package com.tdd;


public class Cab {


    public int calculateFare(int k, int m) {

        int f = (k*10) + (m);
        int n = f;
        if (n <=5) {
            f = 5;
            System.out.println("Total Fare is 5 Rupees.");
        }else {
            System.out.println("Total Fare is " + f + " Rupees.");
        }
        return f;

    }
}
