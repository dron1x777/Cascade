package org.example.repository;

import org.example.entity.Book;

import java.util.List;

public interface BookRepository {
    List<Book> getBooksByAuthor(String author);
    List<Book> getBooksByGenre(String genre);
}
