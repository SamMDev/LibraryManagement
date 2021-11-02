package com.example.LibraryManagement.stock;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stocks")
public class Stock {
    @Id
    @Column(name = "record_id", length = 36)
    @Getter @Setter
    private String id;

    @Column(name = "book_id", length = 36)
    @Getter @Setter
    private String bookId;

    @Column(name = "location_id", length = 36)
    @Getter @Setter
    private String locationId;

    @Column(name = "in_stock")
    @Getter @Setter
    private Integer intStock;
}
