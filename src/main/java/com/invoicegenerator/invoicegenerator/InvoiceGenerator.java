package com.invoicegenerator.invoicegenerator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
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
	public static double price(double distance, double time) {

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
	public static Object calculateforRides(List<Rides> ride) {
		double totalFare = 0;
		int noofRides = ride.size();
		double avgFare;
		for (Rides rode : ride) {
			totalFare = totalFare + price(rode.distance, rode.time);
		}
		avgFare = totalFare / noofRides;
		System.out.println(Arrays.asList(totalFare, noofRides, avgFare));
		return Arrays.asList(totalFare, noofRides, avgFare);
	}

	public double search(int id) {
		double searchinvoice = 0;
		Rides index = ride.get(id);
		System.out.println(index);
		if (index.id != 0) {
			searchinvoice = price(index.distance, index.time);
		}
		return searchinvoice;
	}

	public static void main(String[] args) {
		List<Rides> ride = new ArrayList<>();
		List<Object> person = (List<Object>) calculateforRides(ride);
		System.out.println(person);
	}
}
