package com.santosh.mvc;

public class Student {
	public String firstName;
	public String lastName;
	public String country;
	public String progLang;
	public String[] smartPhone;
	
	public String[] getSmartPhone() {
		return smartPhone;
	}
	public void setSmartPhone(String[] smartPhone) {
		this.smartPhone = smartPhone;
	}
	public String getProgLang() {
		return progLang;
	}
	public void setProgLang(String progLang) {
		this.progLang = progLang;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
