package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name = "posting")
public class Posting {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "author")
    private long author;

    @Column(name = "advertisement")
    private long advertisement;


}

