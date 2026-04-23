package org.example.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "profiles")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "profile_gen")
    @SequenceGenerator(
            name = "profile_gen",
            sequenceName = "profile_seq",
            allocationSize = 1
    )
    private Long id;
    private String fullName;
    private String date_of_birth;
    private String gender;
    private String bio;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Profile(String bio, String date_of_birth, String fullName, String gender) {
        this.bio = bio;
        this.date_of_birth = date_of_birth;
        this.fullName = fullName;
        this.gender = gender;
    }
}
