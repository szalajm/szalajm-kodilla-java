package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldPopulationTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        World worldPopulation = new World();

        Continent europe = new Continent();
        Country poland = new Country(BigDecimal.valueOf(38540789L));
        Country germany = new Country(BigDecimal.valueOf(80213432L));
        Country ukraine = new Country(BigDecimal.valueOf(45234520L));
        worldPopulation.addContinent(europe);
        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(ukraine);

        Continent asia = new Continent();
        Country china = new Country(BigDecimal.valueOf(1340290890L));
        Country india = new Country(BigDecimal.valueOf(1080890972L));
        Country uzbekistan = new Country(BigDecimal.valueOf(20890780L));
        worldPopulation.addContinent(asia);
        asia.addCountry(china);
        asia.addCountry(india);
        asia.addCountry(uzbekistan);

        Continent africa = new Continent();
        Country nigeria = new Country(BigDecimal.valueOf(10089000120L));
        Country egipt = new Country(BigDecimal.valueOf(80590780L));
        Country southAfrica = new Country(BigDecimal.valueOf(54890789L));
        worldPopulation.addContinent(africa);
        africa.addCountry(nigeria);
        africa.addCountry(egipt);
        africa.addCountry(southAfrica);

        //When
        BigDecimal totalPopulation = worldPopulation.getPeopleQuantity();
        BigDecimal expectedPopulation = new BigDecimal("12830543072");
        Assert.assertEquals(expectedPopulation, totalPopulation);
    }
}
