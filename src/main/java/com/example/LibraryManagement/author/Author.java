package com.example.LibraryManagement.author;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "author")
public class Author {
    @Id
    @Column(name = "id", length = 36)
    @Getter @Setter
    private String id;

    @Column(name = "first_name", length = 45)
    @Getter @Setter
    private String firstName;

    @Column(name = "last_name", length = 45)
    @Getter @Setter
    private String lastName;

    @Column(name = "degree", length = 45)
    @Getter @Setter
    private String degree;

    @Column(name = "biography", length = 10000)
    @Getter @Setter
    private String biography;
}
