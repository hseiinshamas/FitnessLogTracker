package com.fitnesslogtracker.FitnessLogTracker.repository;

import com.fitnesslogtracker.FitnessLogTracker.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
