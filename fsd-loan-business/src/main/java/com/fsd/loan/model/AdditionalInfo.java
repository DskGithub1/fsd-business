package com.fsd.loan.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "additionalinfo")
public class AdditionalInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name="applicationkey")
	private Long applicationKey;

	@Column(name="nomineename")
	private String nomineeName;
	@Column(name="nomineerelation")
	private String nomineeRelation;
	@Column(name="officeaddress")
	private String officeAddress;

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

	public String getNomineeName() {
		return nomineeName;
	}

	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}

	public String getNomineeRelation() {
		return nomineeRelation;
	}

	public void setNomineeRelation(String nomineeRelation) {
		this.nomineeRelation = nomineeRelation;
	}

	public String getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}

	@Override
	public String toString() {
		return "AdditionalInfo [id=" + id + ", applicationKey=" + applicationKey + ", nomineeName=" + nomineeName
				+ ", nomineeRelation=" + nomineeRelation + ", officeAddress=" + officeAddress + "]";
	}

}
