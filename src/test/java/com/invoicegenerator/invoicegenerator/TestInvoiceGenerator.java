package com.invoicegenerator.invoicegenerator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestInvoiceGenerator {

	@Test
	public void givenDistanceAndTime_ShouldReturnTotalFare() {
		InvoiceGenerator invoice = new InvoiceGenerator();
		double fare = invoice.price(2.0, 5.0);
		assertEquals(25.0, fare, 0.0);
	}

}
