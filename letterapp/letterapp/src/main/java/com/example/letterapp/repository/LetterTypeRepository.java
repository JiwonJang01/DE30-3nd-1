package com.example.letterapp.repository;


import com.example.letterapp.model.LetterType;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.letterapp.model.LetterType;

public interface LetterTypeRepository extends JpaRepository<LetterType, Long> {
}

