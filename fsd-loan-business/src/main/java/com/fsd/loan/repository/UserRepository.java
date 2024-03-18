package com.fsd.loan.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.fsd.loan.model.User;

public interface UserRepository extends JpaRepository<User, String> {
    User findByMobileNumberAndDateOfBirth(String mobileNumber, String dateOfBirth);
}
