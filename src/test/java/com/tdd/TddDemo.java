package com.tdd;

import org.junit.Assert;
import org.junit.Test;

public class TddDemo {
    @Test
    public void shouldReturnTotalFareOfJourney() {
        Cab cab = new Cab();
        int total = cab.calculateFare(0, 3);
        Assert.assertEquals(5, total);

    }


}
