package com.kodilla.good.patterns.challanges;

public class SaleServiceImplemented implements SaleService {

    public SaleServiceImplemented() {
    }

    @Override
    public boolean sale(Customer customer, Product product, Delivery delivery) {

        return delivery.getDeliveryForm()== "InPost";
    }
}
