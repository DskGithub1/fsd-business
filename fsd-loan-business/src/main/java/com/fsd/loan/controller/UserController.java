package com.fsd.loan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fsd.loan.bean.UserLoginRequest;
import com.fsd.loan.model.Users;
import com.fsd.loan.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@PostMapping("/application")
	@CrossOrigin
	public Users login(@RequestBody UserLoginRequest request) {
		Users user = null;
		try {
			user = userRepository.findByMobileNumberAndDateOfBirth(request.getMobileNumber(), request.getDateOfBirth());
			if (null == user) {
				Users users = new Users();
				users.setDateOfBirth(request.getDateOfBirth());
				users.setMobileNumber(request.getMobileNumber());
				userRepository.save(users);
				return userRepository.save(users);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
}
