package data.repositories;

import com.africa.data.models.Comment;
import com.africa.data.repositories.CommentRepository;
import com.africa.data.repositories.CommentRepositoryImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCommentRepositoryTest {
    CommentRepository commentRepository = new CommentRepositoryImpl();

    @Test
    void testThatUserIdBeCanAdded() {
        Comment olofofo = new Comment();
        olofofo.setId(1);
        commentRepository.save(olofofo);
        assertEquals(1,commentRepository.count());
    }

    @Test
    void testThatUserCanBeCreatedById() {
        Comment olofofo = new Comment();
        commentRepository.save(olofofo);
        assertEquals(1, commentRepository.count());
    }

    @Test
    void testThatUserCanBeDeletedById() {
        Comment olofofo = new Comment();
        commentRepository.save(olofofo);
        commentRepository.delete(olofofo);
        assertEquals(0, commentRepository.count());
    }

    @Test
    void testThatAllCommentCanBeFindById() {
        Comment olofofo = new Comment();
        olofofo.setId(1);
        commentRepository.save(olofofo);
        commentRepository.findAll();
        assertEquals(1, commentRepository.findById(1));
    }

    @Test
    void testThatUserCanAddComment() {
        Comment olofofo = new Comment();
        olofofo.setContent("Blockbustering topics for all sport and enter");
    }

    @Test
    void save() {
    }

    @Test
    void deleteById() {
    }

}