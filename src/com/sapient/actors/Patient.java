package com.sapient.actors;

public class Patient {
	private int patientCode;
	private String patientName;
	private int age;
	private long handPhone;
	private String email;
	private String gender;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(int patientCode, String patientName, int age, long handPhone, String email, String gender) {
		super();
		this.patientCode = patientCode;
		this.patientName = patientName;
		this.age = age;
		this.handPhone = handPhone;
		this.email = email;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Patient [patientCode=" + patientCode + ", patientName=" + patientName + ", age=" + age + ", handPhone="
				+ handPhone + ", email=" + email + ", gender=" + gender + "]";
	}
	public int getPatientCode() {
		return patientCode;
	}
	public void setPatientCode(int patientCode) {
		this.patientCode = patientCode;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getHandPhone() {
		return handPhone;
	}
	public void setHandPhone(long handPhone) {
		this.handPhone = handPhone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
