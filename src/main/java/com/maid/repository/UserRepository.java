package com.maid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maid.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
