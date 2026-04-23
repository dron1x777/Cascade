package org.example.service;

import org.example.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> getBooksByAuthor(String author);
    List<Book> getBooksByGenre(String genre);
}
