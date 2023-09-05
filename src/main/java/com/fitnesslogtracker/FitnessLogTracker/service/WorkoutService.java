package com.fitnesslogtracker.FitnessLogTracker.service;

import com.fitnesslogtracker.FitnessLogTracker.entity.Workout;
import com.fitnesslogtracker.FitnessLogTracker.repository.WorkoutRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class WorkoutService {

    private final WorkoutRepository workoutRepository;

    public List<Workout> getAllWorkouts() {
        return workoutRepository.findAll();
    }
}
