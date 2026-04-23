package org.example.repository;

import org.example.entity.Book;
import org.example.entity.Library;

public interface LibraryRepository {
    void addBook(Long libraryId, Book book);
    void removeBook(Long bookId);
    Library getLibraryWithMostBooks();

}
