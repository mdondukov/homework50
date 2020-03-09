package com.example.homework50.model;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
    @Override
    List<User> findAll();

    @Override
    Optional<User> findById(String s);
}
