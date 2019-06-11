package com.kodilla.good.patterns.challanges;

public class SaleDto {

    public Customer customer;
    public boolean isSold;

    public SaleDto(final Customer customer, final boolean isSold) {
        this.customer = customer;
        this.isSold = isSold;
    }

    public Customer getCustomer() {
        return customer;
    }

    public boolean isSold() {
        return isSold;
    }
}
