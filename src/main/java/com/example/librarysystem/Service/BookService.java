package com.example.librarysystem.Service;

import com.example.librarysystem.Domain.Book;
import com.example.librarysystem.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;


        public void addBook(Book book) {
            bookRepository.save(book);
        }

        public Book updateBook(String isbn, Book book) {
            return bookRepository.updateBookByIsbn(isbn, book);
        }

        public Book deleteBook(String isbn) {
            return bookRepository.deleteBookByIsbn(isbn);
        }
}


