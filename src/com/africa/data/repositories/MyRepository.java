package com.africa.data.repositories;

import com.africa.data.models.Post;

import java.util.ArrayList;
import java.util.List;

public class MyRepository implements PostRepository{
    private List<Post> postings = new ArrayList<>();
    private int id;


    @Override
    public void save(Post post) {
        Post newPost = new Post();
        postings.add(post);
    }

    @Override
    public Post findById(int id) {
        for (int count = 0; count < postings.size(); count++) {
            if (postings.get(count).getId() == id) {
                return postings.get(count);
            }
        }
        return null;
    }

    @Override
    public List<Post> findAll() {
        for (int count = 0; count < postings.size(); count++) {
            postings.get(count);
        }
        return List.of();
    }

    @Override
    public long count() {
        return postings.size();
    }

    @Override
    public void deleteAll() {
        for (Post post : postings) {
            postings.clear();
        }
    }


    @Override
    public void deleteById(int id) {
        for(int count = 0; count < postings.size(); count++){
            if(postings.get(count).getId() == id){
                postings.remove(count);
            }
        }
    }

    private int generateId(int id) {
        return this.id++;
    }

}
