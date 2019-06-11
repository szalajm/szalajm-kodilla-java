package com.kodilla.good.patterns.challanges;

public class SaleRepositoryImplemented implements SaleRepository {

    public SaleRepositoryImplemented() {
    }

    @Override
    public boolean createSale(Customer customer, Product product) {
        return customer.getCustomerName().length() > 5;
    }
}
