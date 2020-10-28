package com.tdd;

import org.junit.Assert;
import org.junit.Test;

public class TddDemo {
    @Test
    public void InvoiceServiceTest() {
        Cab cab = new Cab();
        cab.FareDetail("Bibhav", 4, 2);
        cab.FareDetail("Bibhav", 7, 2);
        cab.FareDetail("Bibhav", 2, 8);

        int total = cab.RideRepo("Bibhav").total;
        System.out.println(total);
        Assert.assertEquals(142, total);
    }


}
