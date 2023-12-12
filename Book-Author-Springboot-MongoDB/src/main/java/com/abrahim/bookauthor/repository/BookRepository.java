package com.abrahim.bookauthor.repository;

import com.abrahim.bookauthor.model.Book;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {
  Optional<Book> findByIsbn(String isbn);

}
