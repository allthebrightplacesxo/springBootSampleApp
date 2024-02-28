package com.example.demo.dto;

import com.example.demo.entities.*;

import java.util.List;

public class BookAuthorResult extends Book {

    public List<Author> getAuthorDetails() {
        return authorDetails;
    }

    public void setAuthorDetails(List<Author> authorDetails) {
        this.authorDetails = authorDetails;
    }

    public List<Author> authorDetails;
    public BookAuthorResult(String bookname, String author, int price) {
        super(bookname, author, price);
    }
}
