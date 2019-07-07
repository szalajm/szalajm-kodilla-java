package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {

        //Given
        User seba = new Millenials("Seba");
        User kuba = new YGeneration("Kuba");
        User dzesika = new ZGeneration("Dzesika");

        //When
        String sebaShareStrategy = seba.sharePost();
        String kubaShareStrategy = kuba.sharePost();
        String dzesikaShareStrategy = dzesika.sharePost();

        //Then
        Assert.assertEquals("Send new Facebook post", sebaShareStrategy);
        Assert.assertEquals("Send new snap", kubaShareStrategy);
        Assert.assertEquals("Send new tweet", dzesikaShareStrategy);
    }

    @Test
    public void testIndividualSharingStrategies() {

        //Given
        User seba = new Millenials("Seba");

        //When
        seba.setSocialPublisher(new SnapchatPublisher());
        String sebaSharingStrategy = seba.sharePost();


        //Then
        Assert.assertEquals("Send new snap", sebaSharingStrategy);
    }
}
