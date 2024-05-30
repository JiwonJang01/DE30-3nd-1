package com.example.letterapp.repository;

import com.example.letterapp.model.Letter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LetterRepository extends JpaRepository<Letter, Long> {
    List<Letter> findByRecipientUsername(String username);
}
