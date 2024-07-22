package com.africa.data.repositories;

import com.africa.data.models.Comment;

import java.util.ArrayList;
import java.util.List;

public class CommentRepositoryImpl implements CommentRepository {
    private List<Comment> commentsList = new ArrayList<>();
    private int id;


    private int generateId() {
        return id++;
    }

    @Override
    public void save(Comment comment) {
        Comment newComment = new Comment();
        commentsList.add(comment);
    }

    @Override
    public Comment findById(int id) {
        for (Comment comment : commentsList) {
            if (comment.getId() == id) {
                return comment;
            }
        }
        return null;
    }

    @Override
    public List<Comment> findAll() {
        for (Comment comment : commentsList) {
            if(commentsList.contains(comment)) {
                return commentsList;
            }
        }
        return List.of();
    }

    @Override
    public long count() {
        return commentsList.size();
    }


    @Override
    public void delete(Comment comment) {
        for (int count = 0; count < commentsList.size(); count++) {
            if (commentsList.get(count).getId() == comment.getId()) {
                commentsList.remove(comment);
            }
        }
    }


    @Override
    public void deleteById(int id) {
        for (int count = 0; count < commentsList.size(); count++) {
            if (commentsList.get(count).getId() == id) {
                commentsList.remove(count);
            }
        }
    }

}