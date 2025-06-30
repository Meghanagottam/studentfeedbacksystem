package com.example.feedback.model;

import jakarta.persistence.*;

@Entity
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String course;
    private String feedback;
    private int rating;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    // Getters and Setters
}
