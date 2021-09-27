package com.invoicegenerator.invoicegenerator;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestInvoiceGenerator {

	@Test
	public void givenDistanceAndTime_ShouldReturnTotalFare() {
		InvoiceGenerator invoice = new InvoiceGenerator();
		double fare = invoice.price(2.0, 5.0);
		assertEquals(25.0, fare, 0.0);
	}


@Test
public void givenMultipleRides_ShouldReturnTotalFare()
{
    InvoiceGenerator invoice =  new InvoiceGenerator();
    List<Rides> ride = new ArrayList<>();
    ride.add(new Rides(2.0,5.0));
    ride.add(new Rides(0.1,1.0));
    double fare = invoice.calculateforRides(ride);
    assertEquals(30.0, fare, 0.0);
}
}
