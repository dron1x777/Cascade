package org.example.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "comments")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "comments_gen")
    @SequenceGenerator(
            name = "comments_gen",
            sequenceName = "comments_seq",
            allocationSize = 1
    )
    private Long id;
    private String text;
    private Date comment_date;
    @ManyToMany(mappedBy = "comments")
    private List<Post> posts = new ArrayList<>();
    @ManyToOne
    private User user;

    public Comment(Date comment_date,String text) {
        this.comment_date = comment_date;
        this.text = text;
    }
}
