package com.library.libraryapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "book")
@Data
public class BookModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceID")
    @SequenceGenerator(name = "sequenceID", sequenceName = "sequenceID", allocationSize = 1)
    private long id;

    @Column
    private String title;

    @Column
    private String author;

    @Column
    private String review;

    @Column
    private float rating;
    
}
