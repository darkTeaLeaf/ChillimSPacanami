package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name = "posting")
public class Posting {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;

    @Column(name = "author")
    public long author;

    @Column(name = "advertisement")
    public long advertisement;


}

