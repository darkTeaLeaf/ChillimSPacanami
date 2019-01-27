package com.example.demo;

import org.springframework.data.repository.CrudRepository;

interface UserRepository extends CrudRepository<User, Long> {
    User getUserByLogin(String login);
}
