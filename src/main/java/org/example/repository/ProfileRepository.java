package org.example.repository;

import org.example.entity.Profile;

public interface ProfileRepository {
    void saveProfile(Long userId,Profile profile);
    Profile findProfileByUserId(Long userId);
    void deleteProfileByUserId(Long userId);

}
