package com.tdd;

import org.junit.Assert;
import org.junit.Test;

public class TddDemo {
    @Test
    public void shouldReturnTotalFareOfJourney() {
        Cab cab = new Cab();
        cab.calculateFare(0, 3);
        cab.calculateFare(3, 4);
        cab.calculateFare(4, 5);
        cab.calculateFare(5, 6);

        Assert.assertEquals(140, cab.total);

    }


}