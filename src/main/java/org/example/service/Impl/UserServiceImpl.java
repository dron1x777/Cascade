package org.example.service.Impl;

import org.example.entity.Profile;
import org.example.entity.User;
import org.example.repository.Impl.UserRepositoryImpl;
import org.example.repository.UserRepository;
import org.example.service.UserServic2;

public class UserServiceImpl implements UserServic2 {
    private UserRepository userRepository = new UserRepositoryImpl();
    @Override
    public void saveUser(User user) {
        userRepository.saveUser(user);
        System.out.println("user has saved");
    }

    @Override
    public User findUserById(Long id) {
        return userRepository.findUserById(id);
    }

    @Override
    public User updateUserProfile(Long id, Profile profile) {
        return userRepository.updateUserProfile(id,profile);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteUser(id);
        System.out.println("user has deleted");
    }
}
