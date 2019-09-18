package com.kodilla.patterns2.observer.forum;

import org.junit.Assert;
import org.junit.Test;

public class ForumUserTestSuite {

    @Test
    public void testUpdate(){
        //Given
        ForumTopic javaHelpForum = new JaveHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser ivoneEscobar = new ForumUser("Ivone Escobar");
        ForumUser jessiePinkmqan = new ForumUser("Jessie Pinkman");
        javaHelpForum.registerObserver(johnSmith);
        javaHelpForum.registerObserver(jessiePinkmqan);
        javaToolsForum.registerObserver(jessiePinkmqan);
        javaToolsForum.registerObserver(ivoneEscobar);
        //When
        javaHelpForum.addPost("abcr");
        javaHelpForum.addPost("adada");
        javaHelpForum.addPost("dadada");
        javaToolsForum.addPost("asSs");
        javaToolsForum.addPost("dada");
        //Then
        Assert.assertEquals(2, ivoneEscobar.getUpdateCount());
        Assert.assertEquals(3, johnSmith.getUpdateCount() );
        Assert.assertEquals(5, jessiePinkmqan.getUpdateCount());
    }
}
