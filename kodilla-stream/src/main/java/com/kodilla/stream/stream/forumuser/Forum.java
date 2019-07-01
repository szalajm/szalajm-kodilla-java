package com.kodilla.stream.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {
        theUserList.add(new ForumUser(001, "user1", 'M', LocalDate.of(1995, 12, 20), 1));
        theUserList.add(new ForumUser(002, "user2", 'F', LocalDate.of(1998, 3, 15), 10));
        theUserList.add(new ForumUser(003, "user3", 'M', LocalDate.of(2004, 3, 01), 2));
        theUserList.add(new ForumUser(004, "user4", 'F', LocalDate.of(1998, 5, 02), 20));
        theUserList.add(new ForumUser(005, "user5", 'M', LocalDate.of(1985, 4, 21), 4));
        theUserList.add(new ForumUser(006, "user6", 'F', LocalDate.of(1991, 8, 05), 50));
        theUserList.add(new ForumUser(007, "user7", 'M', LocalDate.of(2001, 2, 15), 4));
        theUserList.add(new ForumUser(010, "user8", 'F', LocalDate.of(2007, 9, 15), 29));
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(theUserList);
    }

}
