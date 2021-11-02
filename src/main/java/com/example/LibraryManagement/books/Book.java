package com.example.LibraryManagement.books;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "book")
public class Book {
    @Getter @Setter
    private static ObjectMapper objectMapper = new ObjectMapper();

    @Id
    @Column(name = "id", length = 36)
    @Getter @Setter
    private String id;

    @Column(name = "name", length = 100)
    @Getter @Setter
    private String name;

    // will be serialized
    @Column(name = "author_id", length = 400)
    @Getter @Setter
    private String author;

    @Transient
    @Getter
    private List<String> authorList;

    @Column(name = "language", length = 45)
    @Getter @Setter
    private String language;

    @Column(name = "release_date")
    @Temporal(TemporalType.DATE)
    @Getter @Setter
    private Date releaseDate;

    @Column(name = "pages")
    @Getter @Setter
    private Integer pages;

    @Column(name = "publisher_id", length = 36)
    private String publisherId;

    @Column(name = "genre_id", length = 36)
    @Getter @Setter
    private String genreId;

    @PostLoad
    protected void initAuthors(){
        if(!StringUtils.isBlank(this.author)){
            try {
                this.authorList = Arrays.asList(objectMapper.readValue(this.author, String[].class));
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        }
    }

    public void setAuthorList(List<String> authorsIds){
        this.authorList = authorsIds;
        try {
            this.author = objectMapper.writeValueAsString(this.authorList);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
