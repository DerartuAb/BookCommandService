package com.example.librarysystem.Domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//BooksCommand Service:
//    properties: isbn, title, description, author name
@Document
public class Book {
    @Id
    private String isbn;
    private String title;
    private String description;
    private String authorName;

    public Book(String isbn, String title, String description, String authorName) {
        this.isbn = isbn;
        this.title = title;
        this.description = description;
        this.authorName = authorName;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getAuthorName() {
        return authorName;
    }

}
