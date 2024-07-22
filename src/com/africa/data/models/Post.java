package com.africa.data.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Post {
    private int id;
    private String title;
    private String content;
    private List<Comment> comments = new ArrayList<>();
    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime updatedAt;


    public Post() {
    }

    public void addComment() {
        Comment checkAm = new Comment();
        checkAm.setId(id);
        checkAm.setContent(content);
        checkAm.setCreatedAt(createdAt);
        comments.add(checkAm);
    }

    public void removeContent(String content) {
        for (int count = 0; count < comments.size(); count++) {
            if (comments.get(count).getContent().equals(content)) {
                comments.remove(count);
            }
        }

    }

    public void removeComment(int id) {
        for (int count = 0; count < comments.size(); count++) {
            if (comments.get(count).getId() == id) {
                comments.remove(count);
            }
        }
    }

    public Comment updateComment(int id, String comment) {
        for (int count = 0; count < comments.size(); count++) {
            if (comments.get(count).getId() == id) {
                comments.add(1, comments.get(count));
            }
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }


}
