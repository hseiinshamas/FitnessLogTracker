package com.fitnesslogtracker.FitnessLogTracker.service;

import com.fitnesslogtracker.FitnessLogTracker.dto.UserDto;
import com.fitnesslogtracker.FitnessLogTracker.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
}
