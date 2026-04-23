package org.example.service.Impl;

import org.example.entity.Profile;
import org.example.repository.Impl.ProfileRepositoryImpl;
import org.example.repository.ProfileRepository;
import org.example.service.ProfileService;

public class ProfileServiceImpl implements ProfileService {
    private ProfileRepository profileRepository = new ProfileRepositoryImpl();

    @Override
    public void saveProfile(Long userId, Profile profile) {
        profileRepository.saveProfile(userId,profile);
        System.out.println("profile has saved");
    }

    @Override
    public Profile findProfileByUserId(Long userId) {
        return profileRepository.findProfileByUserId(userId);
    }

    @Override
    public void deleteProfileByUserId(Long userId) {
        profileRepository.deleteProfileByUserId(userId);
        System.out.println("profile has deleted");
    }
}
