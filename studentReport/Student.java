package com.Assessment.studentReport;

public class Student {
	private int id;
	private String name;
	private double marks;
	private String address;
	public Student() {
	}
	public Student(int id, String name, double marks, String address) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", address=" + address + "]";
	}
	
	
	
	

}
