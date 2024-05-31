package com.example.letterapp.controller;

import com.example.letterapp.model.Letter;
import com.example.letterapp.service.LetterService;
import com.example.letterapp.service.LetterTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.security.Principal;
import java.util.List;

@Controller
public class LetterDetails {

    @Autowired
    private LetterService letterService;

    @Autowired
    private LetterTypeService letterTypeService;


    // 편지 목록을 가져오는 메서드
    @GetMapping("/letterDetails")
    public String getLetterDetails(Model model, Principal principal) {
        String recipient = principal.getName();
        List<Letter> letters = letterService.getLettersByRecipient(recipient);
        model.addAttribute("letters", letters);
        return "letterDetails";
    }


    // 특정 편지의 내용을 가져오는 메서드
    @GetMapping("/letterDetails/{id}")
    public String getLetterContentById(@PathVariable Long id, Model model) {
        String content = letterService.getLetterContentById(id);
        model.addAttribute("letterContent", content);
        return "letterContent";
    }
}