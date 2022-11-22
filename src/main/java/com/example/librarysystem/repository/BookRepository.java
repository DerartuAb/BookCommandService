package com.example.librarysystem.repository;

import com.example.librarysystem.Domain.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

//call methods: add, update, delete


@org.springframework.stereotype.Repository
public interface BookRepository extends MongoRepository<Book, String> {

    //update book by isbn
    Book updateBookByIsbn(String isbn, Book book);

    //delete book by isbn
    Book deleteBookByIsbn(String isbn);

}
