package com.kodilla.stream.testing.forum.statistics;

public class StatisticsCalculator {


    double averagePostsPerUser;
    double averageCommentsPerUser;
    double averageCommentsPerPost;

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
        if (statistics.usersNames().size() > 0) {
            averagePostsPerUser = statistics.postsCount() / (double) statistics.usersNames().size();
        } else {
            averagePostsPerUser = 0;
        }
        if (statistics.usersNames().size() > 0) {
            averageCommentsPerUser = statistics.commentsCount() / (double) statistics.usersNames().size();
        } else {
            averageCommentsPerUser = 0;
        }
        if (statistics.postsCount() > 0) {
            averageCommentsPerPost = statistics.commentsCount() / (double) statistics.postsCount();
        } else {
            averageCommentsPerPost = 0;
        }
    }
}