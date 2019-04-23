package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {
    Statistics statistics;

    double numberOfUsers;
    double postsQuantity;
    double commentsQuantity;
    double averagePostsPerUser;
    double averageCommentsPerUser;
    double averageCommentsPerPost;


    public StatisticsCalculator(Statistics statistics) {
    }

    public double getNumberOfUsers() {
        return numberOfUsers;
    }

    public double getPostsQuantity() {
        return postsQuantity;
    }

    public double getCommentsQuantity() {
        return commentsQuantity;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        double numberOfUsers = statistics.usersNames().size();
        double postsQuantity = statistics.postsCount();
        double commentsQuantity = statistics.commentsCount();
        double averagePostsPerUser = statistics.postsCount() / statistics.usersNames().size();
        double averageCommentsPerUser = statistics.commentsCount() / statistics.usersNames().size();
        double averageCommentsPerPost = statistics.commentsCount() / statistics.postsCount();
    }
}