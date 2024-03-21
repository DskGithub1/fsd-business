package com.fsd.loan.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fsd.loan.bean.UserLoginRequest;
import com.fsd.loan.model.User;
import com.fsd.loan.repository.UserRepository;

@RestController
public class UserController {
	
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/application")
    public String login(@RequestBody UserLoginRequest request) {
        User user = userRepository.findByMobileNumberAndDateOfBirth(request.getMobileNumber(), request.getDateOfBirth());
        if (user != null) {
            return "Login successful";
        } else {
            return "Invalid mobile number or date of birth";
        }
    }
}
