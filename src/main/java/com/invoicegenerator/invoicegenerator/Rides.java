package com.invoicegenerator.invoicegenerator;
/*
 * class Rides holds multiple rides
 */
public class Rides {
	double distance;
	double time;
	int id;
	public Rides(int id,double distance, double time) {
		this.id=id;
		this.distance = distance;
		this.time = time;
	}
}