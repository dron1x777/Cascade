package org.example.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "posts")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "post_gen")
    @SequenceGenerator(
            name = "post_gen",
            sequenceName = "post_seq",
            allocationSize = 1
    )
    private Long id;
    private String image;
    private String description;
    private String created;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToMany
    private List<Comment> comments = new ArrayList<>();

    public Post(String created, String description, String image) {
        this.created = created;
        this.description = description;
        this.image = image;
    }
}
