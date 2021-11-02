package com.example.LibraryManagement.genre;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "genre")
public class Genre {
    @Id
    @Column(name = "id", length = 36)
    @Getter @Setter
    private String id;

    @Column(name = "name", length = 100)
    @Getter @Setter
    private String name;
}
