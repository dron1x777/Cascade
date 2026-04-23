package org.example.service.Impl;

import org.example.entity.Book;
import org.example.entity.Library;
import org.example.repository.Impl.LibraryRepositoryIml;
import org.example.repository.LibraryRepository;
import org.example.service.LibraryService;

public class LibraryServiceImpl implements LibraryService {
    private LibraryRepository libraryRepository = new LibraryRepositoryIml();

    @Override
    public void addBook(Long libraryId, Book book) {
        libraryRepository.addBook(libraryId,book);
        System.out.println("book added");
    }

    @Override
    public void removeBook(Long bookId) {
        libraryRepository.removeBook(bookId);
        System.out.println("book deleted");
    }

    @Override
    public Library getLibraryWithMostBooks() {
        return libraryRepository.getLibraryWithMostBooks();
    }
}
