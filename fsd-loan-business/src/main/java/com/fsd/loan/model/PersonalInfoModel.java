package com.fsd.loan.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="personalinfomodel")
public class PersonalInfoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="fullname")
    private String fullName;
    @Column(name="email")
    private String email;
    @Column(name="pan")
    private String pan;
    @Column(name="salary")
    private double salary;
    @Column(name="address")
    private String address;
    @Column(name="applicationkey")
    private Long applicationKey;

    public PersonalInfoModel() {
    }

    public PersonalInfoModel(String fullName, String email, String pan, double salary, String address,Long applicationKey) {
        this.fullName = fullName;
        this.email = email;
        this.pan = pan;
        this.salary = salary;
        this.address = address;
        this.applicationKey=applicationKey;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Long getApplicationKey() {
		return applicationKey;
	}

	public void setApplicationKey(Long applicationKey) {
		this.applicationKey = applicationKey;
	}

	@Override
	public String toString() {
		return "PersonalInfoModel [id=" + id + ", fullName=" + fullName + ", email=" + email + ", pan=" + pan
				+ ", salary=" + salary + ", address=" + address + ", applicationKey=" + applicationKey + "]";
	}

}
