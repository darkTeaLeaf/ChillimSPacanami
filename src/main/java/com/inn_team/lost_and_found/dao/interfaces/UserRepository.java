package com.inn_team.lost_and_found.dao.interfaces;

import com.inn_team.lost_and_found.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByLogin(String login);
    User findUserById(long id);

}