package org.example.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "libraries")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Library {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "library_gen")
    @SequenceGenerator(name = "library_gen", sequenceName = "library_seq", allocationSize = 1)

    private  Long id;
    private String name;
    private String address;
    private int workingHours;
    @OneToMany(mappedBy = "library", cascade = CascadeType.ALL)
    private List<Book> books = new ArrayList<>();
}
