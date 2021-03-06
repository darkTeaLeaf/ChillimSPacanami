package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService (UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(User user){
        userRepository.save(user);
    }

    public User getUserById(long userid){
        return userRepository.findById(userid).get();
    }

    public Iterable<User> fetchAll(){
        return userRepository.findAll();
    }

    public boolean getValidatePassword(String login, String password){
        User user = userRepository.getUserByLogin(login);

        return login.equals(user.login) && password.equals(user.password);
    }
}
