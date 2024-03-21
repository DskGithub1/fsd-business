package com.fsd.loan.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fsd.loan.model.LoanOffer;

@Repository
public interface LoanOfferRepository extends JpaRepository<LoanOffer, Long> {
    List<LoanOffer> findByApplicationKey(Long applicationKey);
}
