package com.nick.apirestcursofullstack.service.user;

import com.nick.apirestcursofullstack.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User createUser(User user){
        User existingUser = userRepository.findByUsername(user.getUsername());
        if(existingUser != null)
            return existingUser;
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        user.setPassword(encoder.encode(user.getPassword()));
        user.setUserRole("Client");
        userRepository.save(user);
        return user;
    }

    public User findUserByUsername(String username){
        User existingUser = userRepository.findByUsername(username);
        return existingUser;
    }
}
