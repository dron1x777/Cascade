package org.example.repository.Impl;

import jakarta.persistence.EntityManager;
import org.example.config.HibernateConfig;
import org.example.entity.Post;
import org.example.entity.User;
import org.example.repository.PostRepository;

import java.util.List;

public class PostRepositoryImpl implements PostRepository {
    private final EntityManager entityManager = HibernateConfig.getEntityManager();

    @Override
    public void savePost(Long userId, Post post) {
        entityManager.getTransaction().begin();
        User user = entityManager.find(User.class,userId);
        user.getPosts().add(post);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public List<Post> getPostsByUserId(Long userId) {
        entityManager.getTransaction().begin();
        User user = entityManager.find(User.class,userId);
        entityManager.getTransaction().commit();
        entityManager.close();
        return user.getPosts();
    }

    @Override
    public Post searchPost(String query) {
        entityManager.getTransaction().begin();
        Post post = entityManager.createQuery("select p from Post p where p.description like :query", Post.class).setParameter("query", "%" + query + "%").getSingleResult();
        entityManager.getTransaction().commit();
        entityManager.close();
        return post;
    }

    @Override
    public void deletePostById(Long id) {
        entityManager.getTransaction().begin();
        Post post = entityManager.createQuery("select p from Post p where p.id = id", Post.class).setParameter("id",id).getSingleResult();
        entityManager.remove(post);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
