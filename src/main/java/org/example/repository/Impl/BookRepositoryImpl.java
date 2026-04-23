package org.example.repository.Impl;

import jakarta.persistence.EntityManager;
import org.example.config.HibernateConfig;
import org.example.entity.Book;
import org.example.entity.Library;
import org.example.repository.BookRepository;

import java.util.List;

public class BookRepositoryImpl implements BookRepository {
    private  final EntityManager entityManager = HibernateConfig.getEntityManager();

    @Override
    public List<Book> getBooksByAuthor(String author) {
        entityManager.getTransaction().begin();
        List<Book> books = entityManager.createQuery("select b from Book as b where b.author = :author", Book.class).setParameter("author",author).getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return books;
    }

    @Override
    public List<Book> getBooksByGenre(String genre) {
        entityManager.getTransaction().begin();
        List<Book> books = entityManager.createQuery("select b from Book as b where b.genre = :genre", Book.class).setParameter("genre",genre).getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return books;
    }
}
