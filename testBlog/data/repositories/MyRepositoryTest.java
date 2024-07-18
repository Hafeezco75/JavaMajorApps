package data.repositories;

import data.models.Post;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyRepositoryTest {
    PostRepository postRepository = new MyRepository();

    @Test
    void testThatUserIdCanBeAdded() {
        Post post = new Post();
        post.setTitle("Test Post");
        post.setId(1);
        post.setContent("Test Content");
        postRepository.save(post);
        assertEquals(1, postRepository.findById(1));
    }

    @Test
    void testThatUserIdCanBeRemoved() {
        Post post = new Post();
        post.setTitle("Test Post");
        post.setId(1);
        post.setContent("Argentina wins the Copa America");
        postRepository.deleteById(2);
        assertEquals(2, postRepository.findById(2));
    }

    @Test
    void findAll() {
    }

    @Test
    void count() {
    }

    @Test
    void deleteAll() {
    }

    @Test
    void save() {
    }

    @Test
    void deleteById() {
    }
}