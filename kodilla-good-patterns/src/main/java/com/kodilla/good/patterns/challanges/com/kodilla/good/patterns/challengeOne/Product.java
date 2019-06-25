package com.kodilla.good.patterns.challanges.com.kodilla.good.patterns.challengeOne;

public class Product {
    private String productName;
    private Double quantity;

    public Product(String productName, Double quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public Double getQuantity() {
        return quantity;
    }
}
