package com.guides.springboot.repository;

import com.guides.springboot.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository  extends JpaRepository<Users, Long> {
}
