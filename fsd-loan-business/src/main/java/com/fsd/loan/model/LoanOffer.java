package com.fsd.loan.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;;

@Entity(name = "loanoffer")
public class LoanOffer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name="applicationkey")
	private Long applicationKey;
	@Column(name="bankname")
	private String bankName;
	@Column(name="interestrate")
	private Double interestRate;
	@Column(name="termmonths")
	private Integer termMonths;
	
	private String bgcolor;
	private String imageurl;

	public String getBgcolor() {
		return bgcolor;
	}

	public void setBgcolor(String bgcolor) {
		this.bgcolor = bgcolor;
	}

	public String getImageurl() {
		return imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public void setTermMonths(Integer termMonths) {
		this.termMonths = termMonths;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getApplicationKey() {
		return applicationKey;
	}

	public void setApplicationKey(Long applicationKey) {
		this.applicationKey = applicationKey;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public int getTermMonths() {
		return termMonths;
	}

	public void setTermMonths(int termMonths) {
		this.termMonths = termMonths;
	}

	public LoanOffer() {
		super();
	
	}

}
