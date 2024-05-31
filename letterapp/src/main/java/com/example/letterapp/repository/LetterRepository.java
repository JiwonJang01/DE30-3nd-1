package com.example.letterapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.letterapp.model.Letter;

public interface LetterRepository extends JpaRepository<Letter, Long> {
}
