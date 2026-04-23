package org.example.repository;

import org.example.entity.Profile;
import org.example.entity.User;

public interface UserRepository {
    void saveUser(User user);
    User findUserById(Long id);
    User updateUserProfile(Long id, Profile profile);
    void deleteUser(Long id);
}
