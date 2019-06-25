package com.kodilla.good.patterns.challanges.com.kodilla.good.patterns.challengeOne;

public class OrderServiceExtraFoodShop implements OrderService {

    public OrderServiceExtraFoodShop() {
    }

    public boolean order(Provider provider, Product product) {

        return product.getQuantity() < 100;

    }
}
