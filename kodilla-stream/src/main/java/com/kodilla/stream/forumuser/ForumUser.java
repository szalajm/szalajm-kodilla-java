package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userID;
    private final String useName;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int postCount;

    public ForumUser(final int userID, final String useName, final char sex, final LocalDate dateOfBirth, final int postCount) {
        this.userID = userID;
        this.useName = useName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.postCount = postCount;
    }

    public int getUserID() {
        return userID;
    }

    public String getUseName() {
        return useName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostCount() {
        return postCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", useName='" + useName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", postCount=" + postCount +
                '}';
    }
}


