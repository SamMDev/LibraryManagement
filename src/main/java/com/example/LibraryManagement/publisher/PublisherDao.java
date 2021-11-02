package com.example.LibraryManagement.publisher;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherDao extends JpaRepository<Publisher, String> {
}
