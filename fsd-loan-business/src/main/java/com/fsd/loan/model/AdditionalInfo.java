package com.fsd.loan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AdditionalInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Long applicationKey;

	private String nomineeName;
	private String nomineeRelation;
	private String officeAddress;

	public AdditionalInfo(Long applicationKey2, String nomineeName2, String nomineeRelation2, String officeAddress2) {
		// TODO Auto-generated constructor stub
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

	// Constructors, getters, and setters

}
