package com.stackroute.paymentservice.exceptions;

public class SpaceAlreadyBooked extends Exception  {
    String message;


    public SpaceAlreadyBooked(String message) {
        super(message);
        this.message = message;
    }




}
