package com.globomatics.reviewservice.repository;

import com.globomatics.reviewservice.model.Review;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ReviewRepository extends MongoRepository<Review, String> {

    Optional<Review> findByProductId(Integer productId);
}
