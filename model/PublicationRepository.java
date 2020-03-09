package com.example.homework50.model;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface PublicationRepository extends MongoRepository<Publication, String> {
    @Override
    List<Publication> findAll();

    List<Publication> findByUser(User user);

    @Override
    Optional<Publication> findById(String id);
}
