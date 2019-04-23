package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.statistics.Statistics;
import com.kodilla.testing.forum.statistics.StatisticsCalculator;

import org.junit.Assert;
import org.junit.Test;


import java.util.*;

import static org.mockito.Matchers.doubleThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    @Test
    public void testEmptyList() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> listEmpty = new ArrayList<String>();
        int testPostCountFull = 1000;
        int testCommentCountHigher = 1500;
        when(statisticsMock.usersNames()).thenReturn(listEmpty);
        when(statisticsMock.postsCount()). thenReturn(testPostCountFull);
        when(statisticsMock.commentsCount()). thenReturn(testCommentCountHigher);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        //When
        double averageCommentsNumber = statisticsCalculator.getAverageCommentsPerUser();

        //Then
        Assert.assertEquals(0, averageCommentsNumber);
    }

    @Test
    public void testFullList() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> listFull = new ArrayList<String>();
        for(int n=1; n<100; n++){
            listFull.add("userName");
        }
        int testPostCountFull = 1000;
        int testCommentCountHigher = 1500;
        when(statisticsMock.usersNames()).thenReturn(listFull);
        when(statisticsMock.postsCount()). thenReturn(testPostCountFull);
        when(statisticsMock.commentsCount()). thenReturn(testCommentCountHigher);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);
        //When
        double averageCommentsNumber = statisticsCalculator.getAverageCommentsPerUser();

        //Then
        Assert.assertEquals(15, averageCommentsNumber);

    }

    @Test
    public void testMoreCommentsThanPosts() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> listEmpty = new ArrayList<String>();
        int testPostCountLower = 1000;
        int testCommentCountHigher = 1500;
        when(statisticsMock.usersNames()).thenReturn(listEmpty);
        when(statisticsMock.postsCount()). thenReturn(testPostCountLower);
        when(statisticsMock.commentsCount()). thenReturn(testCommentCountHigher);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);
        //When
        double averageCommentsPerPost= statisticsCalculator.getAverageCommentsPerPost();

        //Then
        Assert.assertEquals(1.5, averageCommentsPerPost);
    }

    @Test
    public void testMorePostsThanComments() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> listEmpty = new ArrayList<String>();
        int testPostCountHigher = 2000;
        int testCommentCountLower = 1000;
        when(statisticsMock.usersNames()).thenReturn(listEmpty);
        when(statisticsMock.postsCount()). thenReturn(testPostCountHigher);
        when(statisticsMock.commentsCount()). thenReturn(testCommentCountLower);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);
        //When
        double averageCommentsPerPost= statisticsCalculator.getAverageCommentsPerPost();

        //Then
        Assert.assertEquals(0.5, averageCommentsPerPost);
    }

    @Test
    public void testNoComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> listFull = new ArrayList<String>();
        for(int n=1; n<100; n++){
            listFull.add("userName");
        }
        int testPostCountFull = 1000;
        int testCommentsCountEmpty = 0;
        when(statisticsMock.usersNames()).thenReturn(listFull);
        when(statisticsMock.postsCount()). thenReturn(testPostCountFull);
        when(statisticsMock.commentsCount()). thenReturn(testCommentsCountEmpty);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);
        //When
        double averageCommentsNumber = statisticsCalculator.getAverageCommentsPerUser();

        //Then
        Assert.assertEquals(0, averageCommentsNumber);
    }

    @Test
    public void testNoPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> listFull = new ArrayList<String>();
        for(int n=1; n<100; n++){
            listFull.add("userName");
        }
        int testPostCountEmpty = 0;
        int testCommentsCountFull = 1000;
        when(statisticsMock.usersNames()).thenReturn(listFull);
        when(statisticsMock.postsCount()). thenReturn(testPostCountEmpty);
        when(statisticsMock.commentsCount()). thenReturn(testCommentsCountFull);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);
        //When
        double averagePostNumber = statisticsCalculator.getAveragePostsPerUser();

        //Then
        Assert.assertEquals(0, averagePostNumber);
    }

    @Test
    public void testPostsFull(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> listFull = new ArrayList<String>();
        for(int n=1; n<100; n++){
            listFull.add("userName");
        }
        int testPostCountFull = 1000;
        int testCommentsCountFull = 1000;
        when(statisticsMock.usersNames()).thenReturn(listFull);
        when(statisticsMock.postsCount()). thenReturn(testPostCountFull);
        when(statisticsMock.commentsCount()). thenReturn(testCommentsCountFull);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);
        //When
        double averagePostNumber = statisticsCalculator.getAverageCommentsPerPost();

        //Then
        Assert.assertEquals(1, averagePostNumber);
    }

    }

