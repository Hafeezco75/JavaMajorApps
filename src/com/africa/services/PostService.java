package com.africa.services;

import com.africa.data.models.Post;

public interface PostService {

    Post addPost(String title, String content);

    Post findPostById(int id);

    boolean titleExistFor(String title);
}
