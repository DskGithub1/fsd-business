package com.fsd.loan.controller;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fsd.loan.bean.PersonalInfo;
import com.fsd.loan.bean.PersonalInfoRequest;
import com.fsd.loan.model.PersonalInfoModel;
import com.fsd.loan.service.PersonalInfoService;

@RestController
public class PersonalInfoController {

    private final PersonalInfoService personalInfoService;

    @Autowired
    public PersonalInfoController(PersonalInfoService personalInfoService) {
        this.personalInfoService = personalInfoService;
    }

    @PostMapping("/personal-info")
    @CrossOrigin
    public ResponseEntity<PersonalInfoModel> createPersonalInfo(@Valid @RequestBody PersonalInfoRequest request) {
    	PersonalInfoModel createdPersonalInfo = personalInfoService.createPersonalInfo(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdPersonalInfo);
    }
    
    @GetMapping("/personal-info/{id}")
    @CrossOrigin
    public ResponseEntity<PersonalInfoModel> getPersonalInfo(@PathVariable Long id) {
    	PersonalInfoModel personalInfo = personalInfoService.getPersonalInfo(id);
            return ResponseEntity.ok(personalInfo);
    }
}
