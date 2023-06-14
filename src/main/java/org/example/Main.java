package org.example;

import airways.Airway;
import airways.TurkishAirways;
import entity.Customer;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        TurkishAirways thy = new TurkishAirways(40);
        thy.addCity("Bursa",500);
        thy.showSeatingPlan();
        System.out.println();
        Customer ahmet = new Customer("Ahmet","Bungalov",2673723,"09/09/1990");
        thy.addPassenger(ahmet,"K3","Bursa");
        thy.showSeatingPlan();
        System.out.println(thy.getFlightNumber());
        thy.cateringService();
    }
}