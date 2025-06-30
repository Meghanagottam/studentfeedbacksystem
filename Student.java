package com.example.feedback.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Feedback> feedbacks;

    // Getters and Setters
}
