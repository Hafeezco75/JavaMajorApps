package data.repositories;

import data.models.Post;

import java.util.ArrayList;
import java.util.List;

public class MyRepository implements PostRepository{
    private List<Post> postings = new ArrayList<>();


    @Override
    public void save(Post post) {
        Post newPost = new Post();
        postings.add(newPost);
    }

    @Override
    public Post findById(int id) {
        for (Post post : postings) {
            if (post.getId() == id) {
                return (Post) postings;
            }
        }
        return null;
    }

    @Override
    public List<Post> findAll() {
        return List.of();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteAll() {
        for (Post post : postings) {
            postings.clear();
        }
    }

    @Override
    public void deleteById(int id) {
        for (Post post : postings) {
            if (post.getId() == id) {
                postings.remove(id);
            }
        }
    }


}
