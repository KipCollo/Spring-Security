package com.kipcollo.spring.repository;


import com.kipcollo.spring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecurityRepo extends JpaRepository<Integer, User> {
}
