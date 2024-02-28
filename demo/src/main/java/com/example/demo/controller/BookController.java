package com.example.demo.controller;

import com.example.demo.dto.*;
import com.example.demo.entities.*;
import com.example.demo.interfaces.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    IBookCrudRepository crudRepository;
    @Autowired
    IAuthorCrudRepository authorCrudRepository;
    @Autowired
    IReadWriteService readWriteService;

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/book/getAllBooks")
    public List<BookAuthorResult> GetAllBooks() {
        return readWriteService.getALlBooks();
    }
//
//
//    @GetMapping("/book/get")
//    public Book Get(@RequestParam(value = "id") int id)
//    {
//        return crudRepository.findById(1);
//    }

    @GetMapping("/book/getByAuthor")
    public Book GetByAuthor(@RequestParam(value = "author") String name)
    {
        return crudRepository.findBookByAuthor(name);
    }

    @GetMapping("/book/getAuthorByName")
    public Author GetAuthor(@RequestParam(value = "author") String name)
    {
        return authorCrudRepository.findAuthorByName(name);
    }

    @PostMapping("/book/post")
    public boolean Save(@RequestBody() Book book)
    {
        return crudRepository.save(book) != null;
    }


}
