package com.africa.web;

import com.africa.services.PostService;
import com.africa.data.models.Post;
import com.africa.services.PostServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {
    private final PostService postService = new PostServiceImpl();
    private final List<Post> posts = new ArrayList<>();


    @PostMapping("/pin1")
    public String createPost(String title, String content) {
        Post post = new Post();
        post.setTitle(title);
        post.setContent(content);
        posts.add(post);
        return posts.toString();
    }

    @GetMapping("/pin")
    public Post getPost(int id) {
        Post post = new Post();
        post.setId(id);
        posts.add(post);
        for (Post post1 : posts) {
            if (post1.getId() == id) {
                return post1;
            }
        }
        return null;
    }

}
