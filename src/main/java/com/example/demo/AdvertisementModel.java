package com.example.demo;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDate;

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

    @Column(name = "description")
    private String description;

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