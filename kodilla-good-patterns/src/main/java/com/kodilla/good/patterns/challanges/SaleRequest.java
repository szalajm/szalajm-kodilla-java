package com.kodilla.good.patterns.challanges;

public class SaleRequest {

    private Customer customer;
    private Product product;
    private Delivery delivery;

    public SaleRequest(final Customer customer, final Product product, final Delivery delivery) {
        this.customer = customer;
        this.product = product;
        this.delivery = delivery;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product getProduct() {
        return product;
    }

    public Delivery getDelivery() {
        return delivery;
    }
}
