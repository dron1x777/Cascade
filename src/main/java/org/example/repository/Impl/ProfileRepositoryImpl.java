package org.example.repository.Impl;

import jakarta.persistence.EntityManager;
import org.example.config.HibernateConfig;
import org.example.entity.Profile;
import org.example.entity.User;
import org.example.repository.ProfileRepository;

public class ProfileRepositoryImpl implements ProfileRepository {
    private final EntityManager entityManager = HibernateConfig.getEntityManager();

    @Override
    public void saveProfile(Long userId, Profile profile) {
        entityManager.getTransaction().begin();
        User user=entityManager.find(User.class, userId);
        user.setProfile(profile);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public Profile findProfileByUserId(Long userId) {
        entityManager.getTransaction().begin();
        User user=entityManager.find(User.class, userId);
        entityManager.getTransaction().commit();
        entityManager.close();
        return user.getProfile();
    }

    @Override
    public void deleteProfileByUserId(Long userId) {
        entityManager.getTransaction().begin();
        User user=entityManager.find(User.class, userId);
        Profile profile = user.getProfile();
        entityManager.remove(profile);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
