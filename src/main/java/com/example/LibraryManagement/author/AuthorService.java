package com.example.LibraryManagement.author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    @Autowired
    private AuthorDao authorDao;

    public Author getById(String id){
        return this.authorDao.findById(id).orElse(null);
    }
}
