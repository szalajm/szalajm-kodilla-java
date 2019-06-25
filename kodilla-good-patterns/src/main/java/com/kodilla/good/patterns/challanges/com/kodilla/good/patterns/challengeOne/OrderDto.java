package com.kodilla.good.patterns.challanges.com.kodilla.good.patterns.challengeOne;

public class OrderDto {

    private Provider provider;
    private boolean isOrdered;

    public OrderDto(final Provider provider, final boolean isOrdered) {
        this.provider = provider;
        this.isOrdered = isOrdered;
    }

    public Provider getProvider() {
        return provider;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
