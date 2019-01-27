package com.example.demo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface PostingRepository extends CrudRepository<Posting, Long> {

    @Query("SELECT advertisement FROM posting advertisement WHERE advertisement.author = authorId")
    Collection<AdvertisementModel> getAllByAuthor(long authorId);
}
