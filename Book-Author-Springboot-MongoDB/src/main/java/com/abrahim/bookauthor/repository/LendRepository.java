package com.abrahim.bookauthor.repository;

import com.abrahim.bookauthor.model.Book;
import com.abrahim.bookauthor.model.Lend;
import com.abrahim.bookauthor.model.LendStatus;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LendRepository extends MongoRepository<Lend, String> {

  Optional<Lend> findByBookAndStatus(Book book, LendStatus status);
}
