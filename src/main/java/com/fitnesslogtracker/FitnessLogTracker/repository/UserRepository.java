package com.fitnesslogtracker.FitnessLogTracker.repository;

import com.fitnesslogtracker.FitnessLogTracker.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);

}
