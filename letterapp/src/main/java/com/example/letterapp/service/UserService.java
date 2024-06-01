package com.example.letterapp.service;

import com.example.letterapp.model.User;
import com.example.letterapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User registerUser(String username, String password) {
        User user = new User();
        user.setNickname(username);
        user.setPassword(passwordEncoder.encode(password));
        return userRepository.save(user);
    }

    // 닉네임 중복 확인 isNicknameExists 추가
    public boolean isNicknameExists(String nickname) {
        return userRepository.findByNickname(nickname) != null;
    }

    public User findByUsername(String username) {
        return userRepository.findByNickname(username);
    }

    public User getUserById(Long id) {
        Optional<User> user = userRepository.findById(id); // 수정된 부분
        return user.orElse(null);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    //편지 상세
    public String getNicknameByUsername(String nickname) {
        User user = userRepository.findByNickname(nickname);
        return user != null ? user.getNickname() : null;
    }

}
