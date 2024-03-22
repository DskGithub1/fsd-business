package com.fsd.loan.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fsd.loan.model.AdditionalInfo;

@Repository
public interface AdditionalInfoRepository extends JpaRepository<AdditionalInfo, Long> {
    AdditionalInfo findByApplicationKey(Long applicationKey);
}
