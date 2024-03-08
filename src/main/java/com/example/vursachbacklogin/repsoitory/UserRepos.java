package com.example.vursachbacklogin.repsoitory;

import com.example.vursachbacklogin.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepos extends JpaRepository<User, Integer> {

    User getUserByLoginAndPassword(String login,String password);
    User getUserByLogin(String login);
}
