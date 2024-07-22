package com.africa.data.repositories;

import com.africa.data.models.Comment;

import java.util.List;

public interface CommentRepository {

    Comment findById(int id);
    List<Comment> findAll();
    long count();
    void delete(Comment comment);
    void save(Comment comment);
    void deleteById(int id);


}
