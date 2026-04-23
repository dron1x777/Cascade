package org.example.service;

import org.example.entity.Book;
import org.example.entity.Library;

public interface LibraryService {
    void addBook(Long libraryId, Book book);
    void removeBook(Long bookId);
    Library getLibraryWithMostBooks();
}
