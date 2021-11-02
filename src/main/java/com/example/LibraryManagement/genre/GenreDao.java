package com.example.LibraryManagement.genre;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreDao extends JpaRepository<Genre, String> {
}
