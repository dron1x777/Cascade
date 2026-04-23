package org.example.service;

import org.example.entity.Profile;
import org.example.entity.User;

public interface UserServic2 {
    void saveUser(User user);
    User findUserById(Long id);
    User updateUserProfile(Long id, Profile profile);
    void deleteUser(Long id);
}
