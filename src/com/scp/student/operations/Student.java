package com.scp.student.operations;

/***
 * 
 *
 */
public class Student {

	private int studId; //getStudId()
	private String studName;
	private int marks;
	private Address studAddress;
	
	/**
	 * 
	 * @param studId
	 * @param studName
	 * @param marks
	 * @param studAddress
	 */
	public Student(int studId, String studName, int marks, Address studAddress) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.marks = marks;
		this.studAddress = studAddress;

	}

	
	
	
	
	public int getStudId() {
		return studId;
	}





	public void setStudId(int studId) {
		this.studId = studId;
	}





	public String getStudName() {
		return studName;
	}





	public void setStudName(String studName) {
		this.studName = studName;
	}





	public int getMarks() {
		return marks;
	}





	public void setMarks(int marks) {
		this.marks = marks;
	}





	public Address getStudAddress() {
		return studAddress;
	}





	public void setStudAddress(Address studAddress) {
		this.studAddress = studAddress;
	}





	@Override
	public String toString() {
		return "\nStudent [studId=" + studId + ", studName=" + studName + ", marks=" + marks + ", studAddress="
				+ studAddress + "]";
	}
	
}


/**
 * 
 *
 */
class Address {
	private String city;
	private int pinCode;
	
	/**
	 * 
	 * @param city
	 * @param pinCode
	 */
	public Address(String city, int pinCode) {
		super();
		this.city = city;
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", pinCode=" + pinCode + "]";
	}
	
	
	
	
}
