package data.repositories;

import com.africa.data.models.Post;
import com.africa.data.repositories.MyRepository;
import com.africa.data.repositories.PostRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyRepositoryTest {
    PostRepository postRepository = new MyRepository();

    @Test
    void testThatUserIdCanBeAdded() {
        Post post = new Post();
        postRepository.save(post);
        assertEquals(1, postRepository.count());
    }

    @Test
    void testThatUserIdCanBeRemoved() {
        Post post = new Post();
        postRepository.save(post);
        postRepository.deleteById(2);
        assertEquals(1, postRepository.count());
    }

    @Test
    void testThatFindAllUserIdInTheRepository() {
        Post post = new Post();
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