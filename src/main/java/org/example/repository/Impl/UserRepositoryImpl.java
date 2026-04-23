package org.example.repository.Impl;

import jakarta.persistence.EntityManager;
import org.example.config.HibernateConfig;
import org.example.entity.Profile;
import org.example.entity.User;
import org.example.repository.UserRepository;

public class UserRepositoryImpl implements UserRepository {
    private final EntityManager entityManager = HibernateConfig.getEntityManager();
    @Override
    public void saveUser(User user) {
        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public User findUserById(Long id) {
        entityManager.getTransaction().begin();
        User user = entityManager.find(User.class, id);
        entityManager.getTransaction().commit();
        entityManager.close();
        return user;
    }

    @Override
    public User updateUserProfile(Long id, Profile profile) {
        entityManager.getTransaction().begin();
        User user = entityManager.find(User.class, id);
        user.setProfile(profile);
        entityManager.getTransaction().commit();
        entityManager.close();
        return user;
    }

    @Override
    public void deleteUser(Long id) {
        entityManager.getTransaction().begin();
        User user = entityManager.find(User.class, id);
        entityManager.remove(user);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
