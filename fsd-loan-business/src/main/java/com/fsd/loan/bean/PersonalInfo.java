package com.fsd.loan.bean;
public class PersonalInfo {
    private String fullName;
    private String email;
    private String pan;
    private double salary;
    private String address;

    public PersonalInfo() {
    }

    public PersonalInfo(String fullName, String email, String pan, double salary, String address) {
        this.fullName = fullName;
        this.email = email;
        this.pan = pan;
        this.salary = salary;
        this.address = address;
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

    // Getters and setters
    
}
