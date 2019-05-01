package com.kodilla.stream.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;


import java.util.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    @Test
    public void testEmptyList() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> testList = new ArrayList<String>();
        int testPostCount = 1000;
        int testCommentCount = 1500;
        when(statisticsMock.usersNames()).thenReturn(testList);
        when(statisticsMock.postsCount()). thenReturn(testPostCount);
        when(statisticsMock.commentsCount()). thenReturn(testCommentCount);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        double averageCommentsNumber = statisticsCalculator.getAverageCommentsPerUser();
        double averagePostsNumber = statisticsCalculator.getAveragePostsPerUser();

        //Then
        Assert.assertEquals(0, averageCommentsNumber,0.01);
        Assert.assertEquals(0, averagePostsNumber, 0.01);
    }

    @Test
    public void testFullList() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> testList = new ArrayList<String>();
        for(int n=1; n<100; n++){
            testList.add("userName");
        }
        int testPostCount = 1000;
        int testCommentCount = 1500;
        when(statisticsMock.usersNames()).thenReturn(testList);
        when(statisticsMock.postsCount()). thenReturn(testPostCount);
        when(statisticsMock.commentsCount()). thenReturn(testCommentCount);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        double averageCommentsNumber = statisticsCalculator.getAverageCommentsPerUser();
        double averagePostsNumber = statisticsCalculator.getAveragePostsPerUser();

        //Then
        Assert.assertEquals(15, averageCommentsNumber, 0.2);
        Assert.assertEquals(10, averagePostsNumber, 0.2);

    }

    @Test
    public void testMoreCommentsThanPosts() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> testList = new ArrayList<String>();
        for(int n=1; n<100; n++){
            testList.add("userName");
        }
        int testPostCount = 1000;
        int testCommentCount = 1500;
        when(statisticsMock.usersNames()).thenReturn(testList);
        when(statisticsMock.postsCount()). thenReturn(testPostCount);
        when(statisticsMock.commentsCount()). thenReturn(testCommentCount);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        double averageCommentsPerPost= statisticsCalculator.getAverageCommentsPerPost();

        //Then
        Assert.assertEquals(1.5, averageCommentsPerPost, 0.01);
    }

    @Test
    public void testMorePostsThanComments() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> testList = new ArrayList<String>();
        for(int n=1; n<100; n++){
            testList.add("userName");
        }

        int testPostCount = 2000;
        int testCommentCount = 1000;
        when(statisticsMock.usersNames()).thenReturn(testList);
        when(statisticsMock.postsCount()). thenReturn(testPostCount);
        when(statisticsMock.commentsCount()). thenReturn(testCommentCount);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        double averageCommentsPerPost= statisticsCalculator.getAverageCommentsPerPost();

        //Then
        Assert.assertEquals(0.5, averageCommentsPerPost, 0.01);
    }

    @Test
    public void testNoComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> testList = new ArrayList<String>();
        for(int n=1; n<100; n++){
            testList.add("userName");
        }
        int testPostCount = 1000;
        int testCommentsCount = 0;
        when(statisticsMock.usersNames()).thenReturn(testList);
        when(statisticsMock.postsCount()). thenReturn(testPostCount);
        when(statisticsMock.commentsCount()). thenReturn(testCommentsCount);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        double averageCommentsNumber = statisticsCalculator.getAverageCommentsPerUser();
        double averageCommentsPerPost = statisticsCalculator.getAverageCommentsPerPost();

        //Then
        Assert.assertEquals(0, averageCommentsNumber, 0.1);
        Assert.assertEquals(0, averageCommentsPerPost, 0.1);
    }

    @Test
    public void testNoPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> testList = new ArrayList<String>();
        for(int n=1; n<100; n++){
            testList.add("userName");
        }
        int testPostCount = 0;
        int testCommentsCount = 1000;
        when(statisticsMock.usersNames()).thenReturn(testList);
        when(statisticsMock.postsCount()). thenReturn(testPostCount);
        when(statisticsMock.commentsCount()). thenReturn(testCommentsCount);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        double averagePostNumber = statisticsCalculator.getAveragePostsPerUser();
        double averageCommentsPerPost = statisticsCalculator.getAverageCommentsPerPost();

        //Then
        Assert.assertEquals(0, averagePostNumber, 0.01);
        Assert.assertEquals(0, averageCommentsPerPost, 0.01);
    }

    @Test
    public void testPostsFull(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> testList = new ArrayList<String>();
        for(int n=1; n<100; n++){
            testList.add("userName");
        }
        int testPostCount = 1000;
        int testCommentsCount = 1000;
        when(statisticsMock.usersNames()).thenReturn(testList);
        when(statisticsMock.postsCount()). thenReturn(testPostCount);
        when(statisticsMock.commentsCount()). thenReturn(testCommentsCount);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        double averagePostNumber = statisticsCalculator.getAverageCommentsPerPost();
        double averagePostPerUser = statisticsCalculator.getAveragePostsPerUser();

        //Then
        Assert.assertEquals(1, averagePostNumber, 0.2);
        Assert.assertEquals(10, averagePostPerUser, 0.2);
    }

    }

