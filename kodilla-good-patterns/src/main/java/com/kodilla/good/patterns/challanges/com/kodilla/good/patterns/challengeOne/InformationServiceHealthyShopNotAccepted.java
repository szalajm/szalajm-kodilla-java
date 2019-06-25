package com.kodilla.good.patterns.challanges.com.kodilla.good.patterns.challengeOne;

public class InformationServiceHealthyShopNotAccepted implements InformationService {

    public InformationServiceHealthyShopNotAccepted() {
    }

    public void inform() {
        System.out.println("Sorry, this product is currently unavailable. Please check out for this again within next 48 hours");
    }
}
