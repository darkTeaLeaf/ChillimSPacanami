package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface PostingRepository extends CrudRepository<Posting, Long> {

    Collection<AdvertisementModel> getAllByAuthor(long author);
}
