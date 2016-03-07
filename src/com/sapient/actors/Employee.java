package com.sapient.actors;

public class Employee {
	private int empID;
	private String userName;
	private String passWord;
	private String labCode;
	private String role;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int empID, String userName, String passWord, String role, String labCode) {
		super();
		this.empID = empID;
		this.userName = userName;
		this.passWord=passWord;
		this.labCode = labCode;
		this.role = role;
	}

	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getLabCode() {
		return labCode;
	}
	public void setLabCode(String labCode) {
		this.labCode = labCode;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", userName=" + userName + ", labCode=" + labCode + ", role=" + role + "]";
	}
	
}
