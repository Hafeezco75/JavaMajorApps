import data.models.Post;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostTest {

    @Test
    void testThatUserIdCanBeRetrieved() {
        Post blogger = new Post();
        blogger.setId(1);
        assertEquals(1, blogger.getId());
    }

    @Test
    void testThatUserTitleCanBeRetrieved() {
        Post blogger = new Post();
        blogger.setTitle("Football Gists");
        assertEquals("Football Gists", blogger.getTitle());
    }

    @Test
    void testThatCommentCanBeCreated() {
        Post blogger = new Post();
        blogger.removeContent("I love Lionel Messi moves,quite impressive");
    }

}