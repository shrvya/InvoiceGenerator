package com.invoicegenerator.invoicegenerator;

import java.util.ArrayList;
import java.util.List;

/*
 * class generates invoice for a cab
 * based on time and distance;
 */
public class InvoiceGenerator {
	double distance;
	double time;

	/*
	 * method price calculates the fare price distance is the distance traveled time
	 * is the time taken to travel returns cost
	 */
	public double price(double distance, double time) {

		double cost;
		cost = distance * 10 + time * 1;
		if (cost < 5) {
			cost = 5;
		}
		return cost;
	}

	List<Rides> ride = new ArrayList<>();

	/*
	 * method to calculate total fare for all rides takes List rides as parameter
	 * returns total fare
	 */
	public double calculateforRides(List<Rides> ride) {
		double totalFare = 0;
		for (Rides rode : ride) {
			totalFare = totalFare + price(rode.distance, rode.time);
		}
		return totalFare;
	}
}
