package com.example.librarysystem.Controller;

import com.example.librarysystem.Domain.Book;
import com.example.librarysystem.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Provider;

@RestController
public class BookController {
    @Autowired
    BookService bookService;
    @PostMapping("/addBook")
    public void addBook(@RequestBody Book book) {
        bookService.addBook(book);
    }

    @PostMapping("/updateBook")
    public void updateBook(@RequestBody Book book) {
        bookService.updateBook(book.getIsbn(), book);
    }

    @DeleteMapping("/deleteBook")
        public void deleteBook(@RequestBody Book book) {
            bookService.deleteBook(book.getIsbn());
        }
    }


