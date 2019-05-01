package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private BigDecimal countryPopulation;

    public Country(final BigDecimal countryPopulation) {
        this.countryPopulation = countryPopulation;
    }

    public BigDecimal getPeopleQuantity() {
        return countryPopulation;
    }
}
