package com.fsd.loan.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fsd.loan.bean.PersonalInfo;
import com.fsd.loan.model.PersonalInfoModel;

@Repository
public interface PersonalInfoRepository extends JpaRepository<PersonalInfoModel, Long> {
    // Additional methods for specific queries can be defined here
	PersonalInfoModel findByApplicationKey(Long applicationKey);
}
