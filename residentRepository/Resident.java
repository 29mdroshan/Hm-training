package com.Assessment.residentRepository;

public class Resident {
	private String full_name;
	private int social_security_no;
	private char gender;
	
	Resident(){}
	public Resident(String full_name, int social_security_no, char gender) {
		super();
		this.full_name = full_name;
		this.social_security_no = social_security_no;
		this.gender = gender;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public int getSocial_security_no() {
		return social_security_no;
	}
	public void setSocial_security_no(int social_security_no) {
		this.social_security_no = social_security_no;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Resident [full_name=" + full_name + ", social_security_no=" + social_security_no + ", gender=" + gender
				+ "]";
	}
	
	

}
