package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class PostingService {

    private final PostingRepository postingRepository;

    public PostingService(PostingRepository postingRepository){
        this.postingRepository = postingRepository;
    }


}
