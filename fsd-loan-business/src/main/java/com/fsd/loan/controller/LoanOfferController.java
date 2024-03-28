package com.fsd.loan.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fsd.loan.model.LoanOffer;
import com.fsd.loan.service.LoanOfferService;

@RestController
public class LoanOfferController {

    private final LoanOfferService loanOfferService;

    @Autowired
    public LoanOfferController(LoanOfferService loanOfferService) {
        this.loanOfferService = loanOfferService;
    }

    @GetMapping("/api/offerservice/loan-offers")
    @CrossOrigin
    public ResponseEntity<List<LoanOffer>> getLoanOffers(@RequestParam Long applicationKey) {
        List<LoanOffer> loanOffers = loanOfferService.getLoanOffers(applicationKey);
        return ResponseEntity.ok(loanOffers);
    }
}
