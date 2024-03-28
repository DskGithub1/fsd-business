package com.fsd.loan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsd.loan.model.LoanOffer;
import com.fsd.loan.repository.LoanOfferRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class LoanOfferService {

	private final LoanOfferRepository loanOfferRepository;

	@Autowired
	public LoanOfferService(LoanOfferRepository loanOfferRepository) {
		this.loanOfferRepository = loanOfferRepository;
	}

	public List<LoanOffer> getLoanOffers(Long applicationKey) {
		return loanOfferRepository.findAll();

	}
}
