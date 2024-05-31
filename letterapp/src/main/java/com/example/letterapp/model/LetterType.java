package com.example.letterapp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
public class LetterType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx_letterType;

    @ElementCollection
    @CollectionTable(name = "letter_type_category", joinColumns = @JoinColumn(name = "letter_type_id"))
    @Column(name = "category")
    private List<Integer> category;

    private String comment;

    private LocalDateTime date_recieve;

    @ManyToOne
    @JoinColumn(name = "idx_user", nullable = false)
    private User user;

}
