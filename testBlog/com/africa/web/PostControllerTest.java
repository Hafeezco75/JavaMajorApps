package com.africa.web;

import com.africa.data.models.Post;
import com.africa.services.PostServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostControllerTest {

    @Test
    void TestThatPostCanBeCreated() {
        PostController controller = new PostController();
        controller.createPost("Semicolon homepage and space","Tony Nwajuigo is a front tycoon");
        assertEquals(controller.getPost(1).getTitle(), "Semicolon homepage and space");
    }

    @Test
    void getPost() {
        PostController controller = new PostController();
        controller.createPost("Semicolon homepage and space","Tony Nwajuigo is a front tycoon");
        assertEquals(1, controller.getPost(1));
    }
}