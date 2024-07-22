package com.africa.data.repositories;

import com.africa.data.models.Post;

import java.util.List;

public interface PostRepository {

    Post findById(int id);
    List<Post> findAll();
    long count();
    void deleteAll();
    void save(Post post);
    void deleteById(int id);

}
