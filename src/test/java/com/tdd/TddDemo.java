package com.tdd;

import org.junit.Assert;
import org.junit.Test;

public class TddDemo {
    @Test
    public void InvoiceServiceTest() {
        Cab cab = new Cab();
        Invoice invoice = new Invoice();
        cab.FareDetail("Bibhav", Cab.type.NORMAL, 4, 2);
        cab.FareDetail("Bibhav", Cab.type.PREMIUM ,7, 2);
        cab.FareDetail("Bibhav", Cab.type.NORMAL,2, 8);

        int total = cab.RideRepo("Bibhav").total;
        System.out.println("Total Fare is "+total);
        Assert.assertEquals(179, total);
    }


}