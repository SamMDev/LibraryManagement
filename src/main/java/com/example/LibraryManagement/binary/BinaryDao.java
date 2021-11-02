package com.example.LibraryManagement.binary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BinaryDao extends JpaRepository<BinaryObject, String> {
}
