package com.fsd.loan.controller;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsd.loan.bean.PersonalInfo;
import com.fsd.loan.bean.PersonalInfoRequest;
import com.fsd.loan.repository.PersonalInfoRepository;

@SpringBootApplication
@RestController
@RequestMapping("/api/personal-info")
public class PersonalInfoController {

    private PersonalInfoRepository repository = new PersonalInfoRepository();

    @PostMapping("/create")
    public PersonalInfo createPersonalInfo(@RequestBody PersonalInfoRequest request) {
        validatePersonalInfo(request);
        PersonalInfo personalInfo = new PersonalInfo(request.getFullName(), request.getEmail(),
                                                     request.getPan(), request.getSalary(),
                                                     request.getAddress());
        repository.save(personalInfo);
        return personalInfo;
    }

    private void validatePersonalInfo(PersonalInfoRequest request) {
        // Implement validation logic here
    }

    public static void main(String[] args) {
        SpringApplication.run(PersonalInfoController.class, args);
    }
}
