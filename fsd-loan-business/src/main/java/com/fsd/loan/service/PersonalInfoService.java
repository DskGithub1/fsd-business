package com.fsd.loan.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsd.loan.bean.PersonalInfo;
import com.fsd.loan.bean.PersonalInfoRequest;
import com.fsd.loan.model.PersonalInfoModel;
import com.fsd.loan.repository.PersonalInfoRepository;

@Service
public class PersonalInfoService {

    private final PersonalInfoRepository personalInfoRepository;

    @Autowired
    public PersonalInfoService(PersonalInfoRepository personalInfoRepository) {
        this.personalInfoRepository = personalInfoRepository;
    }

    public PersonalInfoModel createPersonalInfo(PersonalInfoRequest request) {
        PersonalInfoModel personalInfo = new PersonalInfoModel(request.getFullName(), request.getEmail(),
                                                     request.getPan(), request.getSalary(),
                                                     request.getAddress(),request.getapplicationKey());
        
     
         return personalInfoRepository.save(personalInfo);
         
    }
    
    public PersonalInfoModel getPersonalInfo(Long applicationKey) {
     return personalInfoRepository.findByApplicationKey(applicationKey);
     
    }
}
