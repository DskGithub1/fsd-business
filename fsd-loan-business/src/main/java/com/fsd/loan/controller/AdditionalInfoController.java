package com.fsd.loan.controller;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fsd.loan.bean.AdditionalInfoRequest;
import com.fsd.loan.model.AdditionalInfo;
import com.fsd.loan.service.AdditionalInfoService;

@RestController
public class AdditionalInfoController {

    private  AdditionalInfoService additionalInfoService;
    
	@Autowired
    public AdditionalInfoController(AdditionalInfoService additionalInfoService) {
        this.additionalInfoService = additionalInfoService;
    }

    @GetMapping("/api/businessservice/additional-info")
    @CrossOrigin
    public ResponseEntity<AdditionalInfo> getAdditionalInfo(@RequestParam Long applicationKey) {
        AdditionalInfo additionalInfoList = additionalInfoService.getAdditionalInfo(applicationKey);
        return ResponseEntity.ok(additionalInfoList);
    }

    @PostMapping("/api/businessservice/additional-info")
    @CrossOrigin
    public ResponseEntity<AdditionalInfo> createAdditionalInfo(@Valid @RequestBody AdditionalInfoRequest request) {
        AdditionalInfo createdAdditionalInfo = additionalInfoService.createAdditionalInfo(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdAdditionalInfo);
    }
}
