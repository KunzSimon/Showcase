package org.educama.shipment.model;

import javax.persistence.Embeddable;

/**
 * This represents the address entity used for database persistence.
 */
@Embeddable
public class Flight {

    public String  flightNumber;
    public String airline;
    public String departureAirport;
    public String destinationAirport;
    public String departureTime;
    public String destinationTime;
    public double price;

    /**
     * Constructor for JPA.
     */
    public Flight() {
        //empty
    }

    public Flight(String flightNumbe, String airline, String departureAirport, String destinationAirport, String departureTime, String destinationTime, double price) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
        this.departureTime = departureTime;
        this.destinationTime = destinationTime;
        this.price = price;
    }
}

