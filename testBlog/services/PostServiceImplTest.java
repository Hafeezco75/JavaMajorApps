package services;

import com.africa.data.models.Post;
import com.africa.services.PostService;
import com.africa.services.PostServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostServiceImplTest {

    @Test
    void testThatPostHasTitle() {
        PostService postService = new PostServiceImpl();
        Post post = new Post();
        post.setTitle("title");
        assertEquals(post.getTitle(), "title");
    }

    @Test
    void testThatPostHasDescription() {
        PostService postService = new PostServiceImpl();
        Post post = new Post();
        post.setContent("Welcome to the No.1 post service in the world");
        assertEquals(post.getContent(), "Welcome to the No.1 post service in the world");
    }

    @Test
    void testThatPostTitleCanBeCreated() {
        PostService postService = new PostServiceImpl();
        postService.addPost("Semicolon Blog","Welcome to the No.1 service in the world");
        assertEquals(postService.titleExistFor("Semicolon Blog"),true);

    }

    @Test
    void testThatPostCanBeRetrievedById() {
        PostService postService = new PostServiceImpl();
        postService.addPost("Semicolon Blog","Welcome to the No.1 service in the world");
        assertEquals(postService.findPostById(1) , 1);
    }
}