package com.kodilla.good.patterns.challanges.com.kodilla.good.patterns.challengeOne;

public class OrderServiceGlutenFreeShop implements OrderService{

    public OrderServiceGlutenFreeShop() {
    }

    public boolean order (Provider provider, Product product){

        return !product.getProductName().contains("gluten");
    }
}
