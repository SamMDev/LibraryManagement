package com.example.LibraryManagement.books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookDao bookDao;

    public Book getById(String id) {
        return bookDao.findById(id).orElseThrow();
    }
}
