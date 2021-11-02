package com.example.LibraryManagement.stock;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StockDao extends JpaRepository<Stock, String> {
}
