package com.inn_team.lost_and_found.dao.implementations;

import com.inn_team.lost_and_found.dao.interfaces.UserRepository;
import com.inn_team.lost_and_found.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDaoImplementation{
    private final UserRepository userRepository;

    @Autowired
    public UserDaoImplementation(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void add(User user) {
        userRepository.saveAndFlush(user);
    }

    public void update(User user) {
        userRepository.saveAndFlush(user);
    }

    public void remove(long userid) {
        userRepository.delete(getById(userid));
    }

    public List<User> getList() {
        return userRepository.findAll();
    }

    public User getById(long userId) {
        return userRepository.findUserById(userId);
    }

    public long getId(User user) {
        return userRepository.findAll().stream()
                .filter(u ->
                        u.getLogin().equals(user.getLogin()) &&
                        u.getPassword().equals(user.getPassword()) &&
                        u.getName().equals(user.getName()) &&
                        u.getSurname().equals(user.getSurname()) &&
                        u.getPhone().equals(user.getPhone()) &&
                        u.getAddress().equals(user.getAddress()))
                .findFirst().get().getId();
    }

    public User findByLogin(String login) {
        return userRepository.findUserByLogin(login);
    }

}
