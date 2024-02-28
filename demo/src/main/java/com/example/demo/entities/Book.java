package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Entity
@Table
@Document(collection = "books")
public class Book
{
    //Defining book id as primary key
    @Column
    private String bookname;
    @Column
    private String author;
    @Column
    private int price;
//    @Column
//    private int id;

    @Id
    private ObjectId _id;

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public Book(String bookname, String author, int price) {
        this.bookname = bookname;
        this.author = author;
        this.price = price;
//        this.id = id;
    }

    public String getBookname()
    {
        return bookname;
    }
    public void setBookname(String bookname)
    {
        this.bookname = bookname;
    }
    public String getAuthor()
    {
        return author;
    }
    public void setAuthor(String author)
    {
        this.author = author;
    }
    public int getPrice()
    {
        return price;
    }
    public void setPrice(int price)
    {
        this.price = price;
    }

//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public int getId() {
//        return id;
//    }
}