package com.fsd.loan.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Users {
    //@Id
   // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "application_key_generator")
   // @SequenceGenerator(name="application_key_generator", sequenceName="application_key_sequence", allocationSize=1)
    @Column(name="applicationkey")  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long applicationKey;
    @Column(name="mobilenumber")
    private String mobileNumber;
    @Column(name="dateofbirth")
    private String dateOfBirth;

    public Long getApplicationKey() {
		return applicationKey;
	}

	public void setApplicationKey(Long applicationKey) {
		this.applicationKey = applicationKey;
	}

	public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
