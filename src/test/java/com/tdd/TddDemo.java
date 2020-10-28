package com.tdd;

import org.junit.Assert;
import org.junit.Test;

public class TddDemo {
    @Test
    public void shouldReturn_TotalFare_AvgFare_NoOfRides() {
        Cab cab = new Cab();
        cab.calculateFare(4,5);
        cab.calculateFare(5,2);
        cab.calculateFare(8,0);
        cab.calculateFare(0,4);

        Assert.assertEquals(182, cab.total);
        Assert.assertEquals(4, cab.noOfRides);
        Assert.assertEquals(45.5, cab.AvgFare(), 0);


    }


}