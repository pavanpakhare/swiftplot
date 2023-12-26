package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.net.URI;
import java.net.URL;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="book")
@Builder
public class Book {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    private String title;


    private  String author;

    private String img;



    @Column(columnDefinition = "TEXT" ,length = 1337)
    private  String summery;
    private String cat;


}
