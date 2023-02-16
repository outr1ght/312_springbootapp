package com.pprak.springbootapp.repository;

import com.pprak.springbootapp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
