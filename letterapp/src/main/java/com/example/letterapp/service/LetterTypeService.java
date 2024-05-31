package com.example.letterapp.service;

import java.util.List;

import com.example.letterapp.model.LetterType;
import com.example.letterapp.repository.LetterTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.letterapp.model.LetterType;
import com.example.letterapp.repository.LetterTypeRepository;

@Service
public class LetterTypeService {

    @Autowired
    private LetterTypeRepository letterTypeRepository;

    public List<LetterType> findAllLetterTypes() {
        return letterTypeRepository.findAll();
    }

    public LetterType findLetterTypeById(Long id) {
        return letterTypeRepository.findById(id).orElse(null);
    }
}