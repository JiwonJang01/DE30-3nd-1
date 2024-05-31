package com.example.letterapp.repository;

import com.example.letterapp.model.LetterType;
import com.example.letterapp.model.User;
import com.example.letterapp.service.LetterTypeService;
import com.example.letterapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Repository
public interface LetterTypeRepository extends JpaRepository<LetterType, Long> {
    List<LetterType> findByUser(User user);
}