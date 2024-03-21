package com.fsd.loan.controller;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fsd.loan.bean.PersonalInfo;
import com.fsd.loan.bean.PersonalInfoRequest;
import com.fsd.loan.service.PersonalInfoService;

@RestController
public class PersonalInfoController {

    private final PersonalInfoService personalInfoService;

    @Autowired
    public PersonalInfoController(PersonalInfoService personalInfoService) {
        this.personalInfoService = personalInfoService;
    }

    @PostMapping("/personal-info")
    public ResponseEntity<PersonalInfo> createPersonalInfo(@Valid @RequestBody PersonalInfoRequest request) {
        PersonalInfo createdPersonalInfo = personalInfoService.createPersonalInfo(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdPersonalInfo);
    }
    
    @GetMapping("/personal-info")
    public ResponseEntity<PersonalInfo> getPersonalInfo(@PathVariable Long id) {
    	PersonalInfo personalInfo = personalInfoService.getPersonalInfo(id);
        if (personalInfo != null) {
            return ResponseEntity.ok(personalInfo);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
