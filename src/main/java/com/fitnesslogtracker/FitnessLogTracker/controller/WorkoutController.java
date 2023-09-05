package com.fitnesslogtracker.FitnessLogTracker.controller;

import com.fitnesslogtracker.FitnessLogTracker.entity.Workout;
import com.fitnesslogtracker.FitnessLogTracker.repository.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/workouts")
public class WorkoutController {

    @Autowired
    private WorkoutRepository workoutRepository;

    public String showWorkoutLogForm(Model model) {
        return "workout/log";
    }

    public String logWorkout(@ModelAttribute Workout workout) {
        workoutRepository.save(workout);
        return "redirect:/workouts/log";
    }

}
