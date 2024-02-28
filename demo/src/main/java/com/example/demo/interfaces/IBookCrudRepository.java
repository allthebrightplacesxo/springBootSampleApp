package com.example.demo.interfaces;

import com.example.demo.entities.Author;
import com.example.demo.entities.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IBookCrudRepository extends MongoRepository<Book, String> {

//    public Book findById(int id);
//    public List<Book> getAllByAuthorEmptyOrderById();

    public Book findBookByAuthor(String author);

    public Book save(Book book);

}
