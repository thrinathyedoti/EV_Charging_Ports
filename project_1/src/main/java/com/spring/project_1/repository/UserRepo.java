package com.spring.project_1.repository;

import com.spring.project_1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
}
