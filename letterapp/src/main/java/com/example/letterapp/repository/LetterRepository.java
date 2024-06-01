package com.example.letterapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.letterapp.model.Letter;

import java.util.List;

public interface LetterRepository extends JpaRepository<Letter, Long> {
    // 편지 상세
    List<Letter> findByRecipient(String recipient);

    // 전체 편지 수 계산을 위해 추가
    long count();
}
