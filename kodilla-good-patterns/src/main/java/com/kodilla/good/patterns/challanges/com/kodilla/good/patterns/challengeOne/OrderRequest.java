package com.kodilla.good.patterns.challanges.com.kodilla.good.patterns.challengeOne;

public class OrderRequest {

    private Provider provider;
    private Product product;

    public OrderRequest(final Provider provider, final Product product) {
        this.provider = provider;
        this.product = product;
    }

    public Provider getProvider() {
        return provider;
    }

    public Product getProduct() {
        return product;
    }
}
