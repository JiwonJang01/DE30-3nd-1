package com.example.letterapp.controller;

import com.example.letterapp.model.Letter;
import com.example.letterapp.service.LetterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class LetterController {


    @Autowired
    private LetterService letterService;

    @GetMapping("/home")
    public String home(Authentication authentication, Model model) {
        String username = authentication.getName();
        List<Letter> letters = letterService.getLettersForUser(username);
        model.addAttribute("letters", letters);
        return "home";
    }

    @GetMapping("/write")
    public String writeLetter(@RequestParam String type, @RequestParam String comment, Model model) {
        model.addAttribute("type", type);
        model.addAttribute("comment", comment);
        return "write";
    }

    @PostMapping("/send")
    public String sendLetter(@RequestParam String type, @RequestParam String comment, @RequestParam String content, Authentication authentication) {
        String username = authentication.getName();
        letterService.saveLetter(username, type, comment, content);
        return "redirect:/home";
    }

    @GetMapping("/letters")
    public String letters(Authentication authentication, Model model) {
        String username = authentication.getName();
        List<Letter> letters = letterService.getLettersForUser(username);
        model.addAttribute("letters", letters);
        return "letters";
    }
}
