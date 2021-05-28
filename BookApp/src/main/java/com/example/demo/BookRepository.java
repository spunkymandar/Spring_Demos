package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

   // @Query(name = "Book.findQuery1")
	Book findByIsbn(String isbn);

    List<Book> findByTitleContaining(String title);
    
    
}