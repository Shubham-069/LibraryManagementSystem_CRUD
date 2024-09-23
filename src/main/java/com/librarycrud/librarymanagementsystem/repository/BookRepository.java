package com.librarycrud.librarymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.librarycrud.librarymanagementsystem.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
