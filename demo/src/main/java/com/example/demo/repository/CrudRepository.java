//package com.example.demo.repository;
//
//import com.example.demo.entities.Book;
//import com.example.demo.interfaces.ICrudRepository;
//import org.springframework.data.domain.Example;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.repository.query.FluentQuery;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//import java.util.function.Function;
//
//@Service
//public class CrudRepository implements ICrudRepository {
//    public List<Book> GetAllBooks(){
//        var book = new Book("Love in big city", "idontknow", 300,1);
//        var list = new ArrayList<Book>();
//        list.add(book);
//        return list;
//    }
//
//    public Book Get(int id)
//    {
//        return new Book("Love in big city", "idontknow", 300,1);
//    }
//
//    @Override
//    public boolean Save(Book book) {
//        return false;
//    }
//
//    public boolean Saved(Book book)
//    {
//        return true;
//    }
//
//
//
//    @Override
//    public <S extends Book> S insert(S entity) {
//        return null;
//    }
//
//    @Override
//    public <S extends Book> List<S> insert(Iterable<S> entities) {
//        return null;
//    }
//
//    @Override
//    public <S extends Book> Optional<S> findOne(Example<S> example) {
//        return Optional.empty();
//    }
//
//    @Override
//    public <S extends Book> List<S> findAll(Example<S> example) {
//        return null;
//    }
//
//    @Override
//    public <S extends Book> List<S> findAll(Example<S> example, Sort sort) {
//        return null;
//    }
//
//    @Override
//    public <S extends Book> Page<S> findAll(Example<S> example, Pageable pageable) {
//        return null;
//    }
//
//    @Override
//    public <S extends Book> long count(Example<S> example) {
//        return 0;
//    }
//
//    @Override
//    public <S extends Book> boolean exists(Example<S> example) {
//        return false;
//    }
//
//    @Override
//    public <S extends Book, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
//        return null;
//    }
//
//    @Override
//    public <S extends Book> S save(S entity) {
//        return null;
//    }
//
//    @Override
//    public <S extends Book> List<S> saveAll(Iterable<S> entities) {
//        return null;
//    }
//
//    @Override
//    public Optional<Book> findById(String s) {
//        return Optional.empty();
//    }
//
//    @Override
//    public boolean existsById(String s) {
//        return false;
//    }
//
//    @Override
//    public List<Book> findAll() {
//        return null;
//    }
//
//    @Override
//    public List<Book> findAllById(Iterable<String> strings) {
//        return null;
//    }
//
//    @Override
//    public long count() {
//        return 0;
//    }
//
//    @Override
//    public void deleteById(String s) {
//
//    }
//
//    @Override
//    public void delete(Book entity) {
//
//    }
//
//    @Override
//    public void deleteAllById(Iterable<? extends String> strings) {
//
//    }
//
//    @Override
//    public void deleteAll(Iterable<? extends Book> entities) {
//
//    }
//
//    @Override
//    public void deleteAll() {
//
//    }
//
//    @Override
//    public List<Book> findAll(Sort sort) {
//        return null;
//    }
//
//    @Override
//    public Page<Book> findAll(Pageable pageable) {
//        return null;
//    }
//}
