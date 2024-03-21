package com.fsd.loan.bean;
import javax.validation.constraints.NotBlank;

public class AdditionalInfoRequest {

    @NotBlank(message = "Application key is required")
    private Long applicationKey;

    @NotBlank(message = "Nominee name is required")
    private String nomineeName;

    @NotBlank(message = "Nominee relation is required")
    private String nomineeRelation;

    @NotBlank(message = "Office address is required")
    private String officeAddress;

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
		return "AdditionalInfoRequest [applicationKey=" + applicationKey + ", nomineeName=" + nomineeName
				+ ", nomineeRelation=" + nomineeRelation + ", officeAddress=" + officeAddress + "]";
	}

    // Constructors, getters, and setters
    
}
