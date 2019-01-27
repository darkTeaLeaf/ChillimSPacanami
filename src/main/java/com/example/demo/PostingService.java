package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PostingService {

    private final PostingRepository postingRepository;

    public PostingService(PostingRepository postingRepository){
        this.postingRepository = postingRepository;
    }

    Collection<User> findAdvertisementsByAuthorId(long authorId){
        return  postingRepository.findAllAdvertisementByAuthorId(authorId);
    }

}
