package com.africa;

import com.africa.data.models.Post;
import com.africa.web.PostController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;
import javax.swing.JOptionPane;

@RestController
@SpringBootApplication
public class Main {
    private static PostController postController;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String prompt = """
                1 -> Create Post
                2 -> Read Post
                3 -> Update Post
                """;

        display(prompt);
        int userInput = Integer.parseInt(scanner.nextLine());
        switch (userInput) {
            case 1 -> createPost();
            case 2 -> readPost();
            case 3 -> UpdatePost("Post Title");
            default -> JOptionPane.showMessageDialog(null, prompt);

        }
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/")
    public PostController getPostController() {
        Post post = new Post();
        return new PostController("post created successfully", (post));
    }

    record PostController(String createPost,Post getPost) {}


    private static void UpdatePost(String postTitle) {
        System.out.println("Enter new post: " + postTitle);
        String post = scanner.next();

        System.out.println("Post updated successfully");
    }

    private String input(String prompt) {
        return JOptionPane.showInputDialog(prompt);
    }

    private static void display(String prompt) {
        System.out.println(prompt);
    }


    private static void createPost() {
        System.out.println("Enter post title: ");
        String title = scanner.next();

        System.out.println("Enter post content: ");
        String content = scanner.next();

        System.out.println("Post created successfully");
    }

    private static void readPost() {
    }

}
