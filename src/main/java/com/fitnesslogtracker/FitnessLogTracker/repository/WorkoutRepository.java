package com.fitnesslogtracker.FitnessLogTracker.repository;

import com.fitnesslogtracker.FitnessLogTracker.entity.User;
import com.fitnesslogtracker.FitnessLogTracker.entity.Workout;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WorkoutRepository extends JpaRepository<Workout, Long> {

}
