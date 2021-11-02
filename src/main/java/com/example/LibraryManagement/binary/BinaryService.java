package com.example.LibraryManagement.binary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BinaryService {
    @Autowired
    private BinaryDao binaryDao;
}
