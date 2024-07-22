package com.africa.services;

import com.africa.data.repositories.MyRepository;
import com.africa.data.models.Post;

public class PostServiceImpl implements PostService {
    public MyRepository postRepository = new MyRepository();
    boolean isTitleCreated;



    public boolean titleExistFor(String title) {
        isTitleCreated = false;
        return true;
    }

    @Override
    public Post addPost(String title, String content) {
        isTitleCreated = true;
        Post post = new Post();
        post.setTitle(title);
        post.setContent(content);
        postRepository.save(post);
        return post;
    }


    @Override
    public Post findPostById(int id) {
        for (Post post : postRepository.findAll()) {
            if (post.getId() == id) {
                return post;
            }
        }
        return null;
    }

}
