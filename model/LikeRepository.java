package com.example.homework50.model;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface LikeRepository extends MongoRepository<Like, String> {
    List<Like> findAllByPublication(Publication publication);
}
