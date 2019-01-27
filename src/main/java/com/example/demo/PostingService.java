package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostingService {

    private final PostingRepository postingRepository;

    public PostingService(PostingRepository postingRepository){
        this.postingRepository = postingRepository;
    }

    List<Posting> findAdvertisementsByAuthorId(long authorId){
        return  postingRepository.findAll().stream().filter(Posting -> Posting.author == authorId).collect(Collectors.toList());
    }

}
