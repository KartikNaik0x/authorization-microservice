package com.kartik.authorizationmicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kartik.authorizationmicroservice.model.UserDao;

public interface UserRepository extends JpaRepository<UserDao, Integer> {
    UserDao findByUsername(String username);
}