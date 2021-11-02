package com.example.LibraryManagement.binary;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "binary_obj")
public class BinaryObject {
    @Id
    @Column(name = "id")
    @Getter @Setter
    private String id;

    @Column(name = "content")
    @Getter @Setter
    private byte[] content;
}
