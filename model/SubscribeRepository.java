package com.example.homework50.model;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface SubscribeRepository extends MongoRepository<Subscribe, String> {
    List<Subscribe> findAllBySubscriber(User subscriber);

    @Override
    Optional<Subscribe> findById(String id);
}
