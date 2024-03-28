package com.fsd.loan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsd.loan.bean.AdditionalInfoRequest;
import com.fsd.loan.model.AdditionalInfo;
import com.fsd.loan.repository.AdditionalInfoRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class AdditionalInfoService {

	private AdditionalInfoRepository additionalInfoRepository;

	@Autowired
	public AdditionalInfoService(AdditionalInfoRepository additionalInfoRepository) {
		this.additionalInfoRepository = additionalInfoRepository;
	}

	public AdditionalInfo getAdditionalInfo(Long applicationKey) {
		return additionalInfoRepository.findByApplicationKey(applicationKey);
	}

	public AdditionalInfo createAdditionalInfo(AdditionalInfoRequest request) {
		AdditionalInfo additionalInfo = additionalInfoRepository.findByApplicationKey(request.getApplicationKey());
		if (null == additionalInfo) {
			additionalInfo = new AdditionalInfo();
			additionalInfo.setApplicationKey(request.getApplicationKey());
			additionalInfo.setNomineeName(request.getNomineeName());
			additionalInfo.setNomineeRelation(request.getNomineeRelation());
			additionalInfo.setOfficeAddress(request.getOfficeAddress());
			additionalInfo = additionalInfoRepository.save(additionalInfo);
		}
		return additionalInfo;
	}
}
