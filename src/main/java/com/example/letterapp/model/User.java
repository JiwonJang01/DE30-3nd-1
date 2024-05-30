package com.example.letterapp.model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "app_user") // 테이블 이름을 "app_user"로 변경
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;

    private String password;

    @OneToMany(mappedBy = "recipient")
    private Set<Letter> receivedLetters;

    // getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Letter> getReceivedLetters() {
        return receivedLetters;
    }

    public void setReceivedLetters(Set<Letter> receivedLetters) {
        this.receivedLetters = receivedLetters;
    }
}
