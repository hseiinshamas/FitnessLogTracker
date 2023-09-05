package com.fitnesslogtracker.FitnessLogTracker.controller;

import com.fitnesslogtracker.FitnessLogTracker.entity.Workout;
import com.fitnesslogtracker.FitnessLogTracker.repository.UserRepository;
import com.fitnesslogtracker.FitnessLogTracker.repository.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/workouts")
public class WorkoutController {

    @Autowired
    private WorkoutRepository workoutRepository;

    @Autowired
    private UserRepository userRepository;


    @GetMapping("/log")
    public String showWorkoutLogForm(Model model) {
        model.addAttribute("workout", new Workout());
        return "workout/log";
    }

    @PostMapping("/log")
    public String logWorkout(@ModelAttribute Workout workout, Model model) {
        workoutRepository.save(workout);
        return "redirect:/workouts/history";
    }

    @GetMapping("/history")
    public String showWorkoutHistory(Model model) {
        // Fetch all logged workouts (history) from the database
        List<Workout> workoutHistory = workoutRepository.findAll();

        model.addAttribute("workoutHistory", workoutHistory);
        return "workout/history"; // Thymeleaf template for workout history
    }
}
