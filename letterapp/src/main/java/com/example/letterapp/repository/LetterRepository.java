package com.example.letterapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.letterapp.model.Letter;

import java.util.List;

public interface LetterRepository extends JpaRepository<Letter, Long> {
    // 편지 상세
    List<Letter> findByRecipient(String recipient);
}
