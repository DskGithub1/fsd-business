package com.fsd.loan.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsd.loan.bean.AdditionalInfoRequest;
import com.fsd.loan.model.AdditionalInfo;
import com.fsd.loan.repository.AdditionalInfoRepository;

@Service
public class AdditionalInfoService {

    private final AdditionalInfoRepository additionalInfoRepository;

    @Autowired
    public AdditionalInfoService(AdditionalInfoRepository additionalInfoRepository) {
        this.additionalInfoRepository = additionalInfoRepository;
    }

    public List<AdditionalInfo> getAdditionalInfo(Long applicationKey) {
        return additionalInfoRepository.findByApplicationKey(applicationKey);
    }

    public AdditionalInfo createAdditionalInfo(AdditionalInfoRequest request) {
        AdditionalInfo additionalInfo = new AdditionalInfo(request.getApplicationKey(),
                request.getNomineeName(), request.getNomineeRelation(), request.getOfficeAddress());
        return additionalInfoRepository.save(additionalInfo);
    }
}
