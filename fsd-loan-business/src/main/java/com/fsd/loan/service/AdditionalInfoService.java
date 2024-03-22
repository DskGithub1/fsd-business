package com.fsd.loan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsd.loan.bean.AdditionalInfoRequest;
import com.fsd.loan.model.AdditionalInfo;
import com.fsd.loan.repository.AdditionalInfoRepository;

@Service
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
		AdditionalInfo additionalInfo=new AdditionalInfo();
		additionalInfo.setApplicationKey(request.getApplicationKey());
		additionalInfo.setNomineeName(request.getNomineeName());
		additionalInfo.setNomineeRelation(request.getNomineeRelation());
		additionalInfo.setOfficeAddress(request.getOfficeAddress());
		
		return additionalInfoRepository.save(additionalInfo);
	}
}
