package com.abrahim.bookauthor.repository;

import com.abrahim.bookauthor.model.Author;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuthorRepository extends MongoRepository<Author, String> {

}
