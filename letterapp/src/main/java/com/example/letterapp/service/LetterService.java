package com.example.letterapp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.letterapp.model.Letter;
import com.example.letterapp.repository.LetterRepository;

@Service
public class LetterService {

    @Autowired
    private LetterRepository letterRepository;

    public void saveLetter(Letter letter) {
        letterRepository.save(letter);
    }

    public List<Letter> findAllLetters() {
        return letterRepository.findAll();
    }

    public Letter findLetterById(Long id) {
        return letterRepository.findById(id).orElse(null);
    }
}
