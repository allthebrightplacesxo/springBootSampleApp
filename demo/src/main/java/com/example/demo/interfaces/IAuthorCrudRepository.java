package com.example.demo.interfaces;

import com.example.demo.entities.Author;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IAuthorCrudRepository extends MongoRepository<Author, String> {
    public Author findAuthorByName(String author);

    public Author save(Author author);
}
