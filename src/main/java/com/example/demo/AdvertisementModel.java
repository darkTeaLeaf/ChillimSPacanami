package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name = "advertisements")
public class AdvertisementModel {

    public static final String TYPE_FOUND = "FOUND";
    public static final String TYPE_LOST = "LOST";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;

    @Column(name = "title")
    private String title;

    @Column(name = "type")
    private String type;

    @Column(name = "question")
    private String question;

    @Column(name = "answer")
    public String answer;

    @Column(name = "answerPerson")
    public long answerPerson;

    @Column(name = "description")
    private String description;

    @Column(name = "status")
    public String status;

    @Column(name = "author")
    public String author;

//    @Column(name = "date")
//    @Type(type = "com.baeldung.hibernate.customtypes.LocalDateStringType")
//    private LocalDate date;
//
//    @Column(name = "dateOfPublication")
//    @Type(type = "com.baeldung.hibernate.customtypes.LocalDateStringType")
//    private LocalDate dateOfPublication;

    @Column(name = "picture")
    private String picture;

    @Column(name = "location")
    private String location;

}