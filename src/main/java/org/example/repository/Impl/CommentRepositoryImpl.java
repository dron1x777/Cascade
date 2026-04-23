package org.example.repository.Impl;

import jakarta.persistence.EntityManager;
import org.example.config.HibernateConfig;
import org.example.entity.Comment;
import org.example.entity.User;
import org.example.repository.CommentRepository;

import java.util.List;

public class CommentRepositoryImpl implements CommentRepository {
    private final EntityManager entityManager = HibernateConfig.getEntityManager();

    @Override
    public void SaveComment(Long userId, Comment comment) {
        entityManager.getTransaction().begin();
        User user = entityManager.find(User.class,userId);
        user.getComments().add(comment);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public List<Comment> findCommentByPostId(Long postId) {
        entityManager.getTransaction().begin();
        List<Comment> comments = entityManager.createQuery("select c from Comment c join c.posts p where p.id = :postId", Comment.class).setParameter("postId", postId).getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return comments;
    }

    @Override
    public void updateComment(Long commentId, String newText) {
        entityManager.getTransaction().begin();
        Comment comment = entityManager.createQuery("select c Comment c where c.id = :commentId", Comment.class).setParameter("commentId",commentId).getSingleResult();
        comment.setText(newText);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public void deleteComment(Long id) {
        entityManager.getTransaction().begin();
        Comment comment = entityManager.createQuery("select c Comment c where c.id = :id", Comment.class).setParameter("id",id).getSingleResult();
        entityManager.remove(comment);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
