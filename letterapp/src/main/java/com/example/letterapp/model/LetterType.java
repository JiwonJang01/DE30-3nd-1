package com.example.letterapp.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class LetterType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx_letterType;

    private int category;

    private String comment;

    private LocalDateTime date_recieve;

    @ManyToOne
    @JoinColumn(name = "idx_user", nullable = false)
    private User user;

    // Getters and Setters

    public Long getIdx_letterType() {
        return idx_letterType;
    }

    public void setIdx_letterType(Long idx_letterType) {
        this.idx_letterType = idx_letterType;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalDateTime getDate_recieve() {
        return date_recieve;
    }

    public void setDate_recieve(LocalDateTime date_recieve) {
        this.date_recieve = date_recieve;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
