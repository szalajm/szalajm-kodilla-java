package com.kodilla.good.patterns.challanges;

public class Delivery {

    private String deliveryForm;
    private String deliveryAddress;

    public Delivery(String deliveryForm, String deliveryAddress) {
        this.deliveryForm = deliveryForm;
        this.deliveryAddress = deliveryAddress;
    }

    public String getDeliveryForm() {
        return deliveryForm;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }
}
