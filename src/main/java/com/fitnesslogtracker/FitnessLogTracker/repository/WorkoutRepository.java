package com.fitnesslogtracker.FitnessLogTracker.repository;

import com.fitnesslogtracker.FitnessLogTracker.entity.Workout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkoutRepository extends JpaRepository<Workout, Long> {

}
