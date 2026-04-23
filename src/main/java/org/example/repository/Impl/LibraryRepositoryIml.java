package org.example.repository.Impl;

import jakarta.persistence.EntityHandler;
import jakarta.persistence.EntityManager;
import org.example.config.HibernateConfig;
import org.example.entity.Book;
import org.example.entity.Library;
import org.example.repository.LibraryRepository;

import java.util.List;

public class LibraryRepositoryIml implements LibraryRepository {
    private  final EntityManager entityManager = HibernateConfig.getEntityManager();

    @Override
    public void addBook(Long libraryId, Book book) {
        entityManager.getTransaction().begin();
        Library library = entityManager.find(Library.class, libraryId);
        library.getBooks().add(book);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public void removeBook(Long bookId) {
        entityManager.getTransaction().begin();
        Book book = entityManager.find(Book.class,bookId);
        entityManager.remove(book);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public Library getLibraryWithMostBooks() {
        entityManager.getTransaction().begin();
        Library library = entityManager.createQuery("select * from Library l left join l.books b group by l.id order by count(b.id) desc limit 1", Library.class).setMaxResults(1).getSingleResult();;
        entityManager.getTransaction().commit();
        entityManager.close();
        return library;
    }
}
