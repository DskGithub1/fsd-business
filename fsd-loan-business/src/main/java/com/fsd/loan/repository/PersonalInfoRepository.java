package com.fsd.loan.repository;
import java.util.ArrayList;
import java.util.List;

import com.fsd.loan.bean.PersonalInfo;

public class PersonalInfoRepository {
    private List<PersonalInfo> personalInfos = new ArrayList<>();

    public void save(PersonalInfo personalInfo) {
        personalInfos.add(personalInfo);
    }

    // Additional methods for data retrieval can be implemented here
}
