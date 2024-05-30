package com.example.letterapp.service;

import com.example.letterapp.model.Letter;
import com.example.letterapp.model.User;
import com.example.letterapp.repository.LetterRepository;
import com.example.letterapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LetterService {

    @Autowired
    private LetterRepository letterRepository;

    @Autowired
    private UserRepository userRepository;

    public Letter saveLetter(String username, String type, String comment, String content) {
        User recipient = userRepository.findByUsername(username).orElse(null);
        if (recipient == null) {
            return null;
        }

        Letter letter = new Letter();
        letter.setRecipient(recipient);
        letter.setType(type);
        letter.setComment(comment);
        letter.setContent(content);

        return letterRepository.save(letter);
    }

    public List<Letter> getLettersForUser(String username) {
        return letterRepository.findByRecipientUsername(username);
    }
}
