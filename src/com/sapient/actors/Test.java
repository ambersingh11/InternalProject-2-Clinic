package com.sapient.actors;

public class Test {
	private int testCode;
	private String testName;
	private float amount;
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Test(int testCode, String testName, float amount) {
		super();
		this.testCode = testCode;
		this.testName = testName;
		this.amount = amount;
	}
	public int getTestCode() {
		return testCode;
	}
	public void setTestCode(int testCode) {
		this.testCode = testCode;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "TestDAO [testCode=" + testCode + ", testName=" + testName + ", amount=" + amount + "]";
	}
	
}
