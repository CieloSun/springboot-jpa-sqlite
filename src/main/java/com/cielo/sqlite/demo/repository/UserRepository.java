package com.cielo.sqlite.demo.repository;

import com.cielo.sqlite.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
