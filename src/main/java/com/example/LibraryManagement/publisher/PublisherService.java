package com.example.LibraryManagement.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublisherService {

    private PublisherDao publisherDao;
    @Autowired
    public PublisherService(PublisherDao publisherDao){
        this.publisherDao = publisherDao;
    }
}
