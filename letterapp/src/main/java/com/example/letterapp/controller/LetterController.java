package com.example.letterapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.letterapp.model.Letter;
import com.example.letterapp.service.LetterService;
import com.example.letterapp.service.LetterTypeService;

@Controller
public class LetterController {

    @Autowired
    private LetterService letterService;

    @Autowired
    private LetterTypeService letterTypeService;

    @GetMapping("/write")
    public String showWritePage(Model model) {
        model.addAttribute("letter", new Letter());
        model.addAttribute("letterTypes", letterTypeService.findAllLetterTypes());
        return "write";
    }

    @PostMapping("/write")
    public String writeLetter(Letter letter) {
        letterService.saveLetter(letter);
        return "redirect:/letters";
    }

    @GetMapping("/letters")
    public String showLettersPage(Model model) {
        model.addAttribute("letters", letterService.findAllLetters());
        return "letters";
    }

    @GetMapping("/letters/{id}")
    public String showLetterPage(@PathVariable Long id, Model model) {
        model.addAttribute("letter", letterService.findLetterById(id));
        return "letter";
    }
}
