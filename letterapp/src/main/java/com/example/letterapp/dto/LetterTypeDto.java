package com.example.letterapp.dto;

import java.util.List;

public class LetterTypeDto {
    private Long userIdx;
    private boolean emailSub;
    private String email;
    private boolean randomSub;
    private List<Integer> category;
    private String comment;

    // Getters and Setters
    public Long getUserIdx() {
        return userIdx;
    }

    public void setUserIdx(Long userIdx) {
        this.userIdx = userIdx;
    }

    public boolean isEmailSub() {
        return emailSub;
    }

    public void setEmailSub(boolean emailSub) {
        this.emailSub = emailSub;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isRandomSub() {
        return randomSub;
    }

    public void setRandomSub(boolean randomSub) {
        this.randomSub = randomSub;
    }

    public List<Integer> getCategory() {
        return category;
    }

    public void setCategory(List<Integer> category) {
        this.category = category;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
