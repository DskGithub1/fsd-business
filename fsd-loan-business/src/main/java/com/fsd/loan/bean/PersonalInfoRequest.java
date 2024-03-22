package com.fsd.loan.bean;
public class PersonalInfoRequest {
    private String fullName;
    private String email;
    private String pan;
    private double salary;
    private String address;
    private Long applicationKey;

    public Long getapplicationKey() {
		return applicationKey;
	}

	public void setapplicationKey(Long appkey) {
		this.applicationKey = appkey;
	}

	public PersonalInfoRequest() {
    }

    public PersonalInfoRequest(String fullName, String email, String pan, double salary, String address,Long appkey) {
        this.fullName = fullName;
        this.email = email;
        this.pan = pan;
        this.salary = salary;
        this.address = address;
        this.applicationKey=appkey;
    }

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


    
}
