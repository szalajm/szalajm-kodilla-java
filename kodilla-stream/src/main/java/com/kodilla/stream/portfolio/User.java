package com.kodilla.stream.portfolio;

import java.util.Objects;

public final class User {
    private final String username;
    private final String realname;

    public String getUsername() {
        return username;
    }

    public String getRealname() {
        return realname;
    }

    public User(final String username, final String realname) {
        this.username = username;
        this.realname = realname;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return username.equals(user.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username);
    }
}
