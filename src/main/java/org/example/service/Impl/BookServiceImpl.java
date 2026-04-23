package org.example.service.Impl;

import org.example.entity.Book;
import org.example.repository.BookRepository;
import org.example.repository.Impl.BookRepositoryImpl;
import org.example.repository.Impl.LibraryRepositoryIml;
import org.example.repository.LibraryRepository;
import org.example.service.BookService;

import java.util.List;

public class BookServiceImpl implements BookService {
    private BookRepository bookRepository = new BookRepositoryImpl();

    @Override
    public List<Book> getBooksByAuthor(String author) {
        return bookRepository.getBooksByAuthor(author);
    }

    @Override
    public List<Book> getBooksByGenre(String genre) {
        return bookRepository.getBooksByGenre(genre);
    }
}
