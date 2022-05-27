package com.example.greetingapp1.repository;

import com.example.greetingapp1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface SpringRepository extends JpaRepository<User, Integer> {
}

