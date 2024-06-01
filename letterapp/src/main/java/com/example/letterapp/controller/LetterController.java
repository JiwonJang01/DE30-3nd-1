package com.example.letterapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.letterapp.model.Letter;
import com.example.letterapp.service.LetterService;
import com.example.letterapp.service.LetterTypeService;

@Controller
public class LetterController {

    @Autowired
    private LetterService letterService;

    @Autowired
    private LetterTypeService letterTypeService;

    @GetMapping("/letterinfo")
    public String showLetterInfo(@RequestParam Long letterIdx, Model model) {
        Letter letter = letterService.findLetterById(letterIdx);
        model.addAttribute("letter", letter);
        return "letterinfo";
    }

    @PostMapping("/send")
    public String sendLetter(@RequestParam String title,
                             @RequestParam String content,
                             @RequestParam String sender,
                             @RequestParam String recipient,
                             @RequestParam Long letterTypeId,
                             Model model) {
        Letter letter = new Letter();
        letter.setTitle(title);
        letter.setContent(content);
        letter.setSender(sender);
        letter.setRecipient(recipient);
        letter.setLetterType(letterTypeService.findLetterTypeById(letterTypeId));
        letterService.saveLetter(letter);
        model.addAttribute("status", "편지가 성공적으로 전송되었습니다");
        return "redirect:/letters";
    }


    // t실행 성공
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

    // totalLetters 새로운 메서드 추가: 전체 편지 수를 계산하여 인덱스 페이지로 전달
    // 메서드 추가 후 빌드가 안되서 /index로 매핑 수정
    @GetMapping("/index")
    public String showIndexPage(Model model) {
        long totalLetters = letterService.countLetters(); // 전체 편지 수 계산
        model.addAttribute("totalLetters", totalLetters); // 모델에 추가
        return "index"; // 인덱스 페이지로 이동
    }
}