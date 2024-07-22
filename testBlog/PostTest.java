import com.africa.data.models.Post;
import com.africa.data.repositories.MyRepository;
import com.africa.data.repositories.PostRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostTest {
    PostRepository postRepository = new MyRepository();

    @Test
    void testThatPostIdCanBeAddedAndRetrieved() {
        Post blogger = new Post();
        blogger.setId(1);
        postRepository.save(blogger);
        assertEquals(1, blogger.getId());
    }

    @Test
    void testThatPostTitleCanBeRetrieved() {
        Post blogger = new Post();
        blogger.setTitle("Football Gists");
        postRepository.save(blogger);
        assertEquals("Football Gists", blogger.getTitle());
    }

    @Test
    void testThatContentCanBeDeleted() {
        Post blogger = new Post();
        blogger.setContent("I love Lionel Messi moves,quite impressive");
        blogger.removeContent("I love Lionel Messi moves,quite impressive");
        assertEquals(0, postRepository.findAll().size());
    }

    @Test
    void testThatCommentCanBeDeletedById() {
        Post blogger = new Post();
        blogger.addComment();
        blogger.removeComment(1);
        assertEquals(1, blogger.getComments().size());
    }

    @Test
    void testThatCommentCanBeAdded() {
        Post blogger = new Post();
        blogger.addComment();
        assertEquals(1, blogger.getComments().size());
    }

    @Test
    void testThatCommentCanBeUpdated() {
        Post blogger = new Post();
        blogger.addComment();
        blogger.updateComment(1,"My blogsite");
        assertEquals(1, blogger.getComments().size());
    }

}