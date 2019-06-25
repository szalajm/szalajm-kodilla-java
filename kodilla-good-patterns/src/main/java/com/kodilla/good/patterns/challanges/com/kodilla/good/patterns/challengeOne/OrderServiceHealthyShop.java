package com.kodilla.good.patterns.challanges.com.kodilla.good.patterns.challengeOne;

public class OrderServiceHealthyShop implements OrderService {

    public OrderServiceHealthyShop() {
    }

    public boolean order (Provider provider, Product product) {
        return product.getQuantity() <= 10;
    }
}
