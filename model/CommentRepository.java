package com.example.homework50.model;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface CommentRepository extends MongoRepository<Comment, String> {
    @Override
    List<Comment> findAll();

    List<Comment> findByUser(User user);

    @Override
    Optional<Comment> findById(String id);
}
