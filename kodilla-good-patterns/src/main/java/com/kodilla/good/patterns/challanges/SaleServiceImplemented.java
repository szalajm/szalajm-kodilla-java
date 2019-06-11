package com.kodilla.good.patterns.challanges;

public class SaleServiceImplemented implements SaleService {

    public SaleServiceImplemented() {
    }

    @Override
    public boolean sale(Customer customer, Product product, Delivery delivery) {

        String InPostConfiirmed = new String("InPost");
        return delivery.getDeliveryForm().equals(InPostConfiirmed);
    }
}
