package com.fsd.loan.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fsd.loan.model.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
    Users findByMobileNumberAndDateOfBirth(String mobileNumber, String dateOfBirth);
}
