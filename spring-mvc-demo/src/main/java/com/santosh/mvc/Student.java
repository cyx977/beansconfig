package com.santosh.mvc;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.santosh.mvc.validation.courseValidation.CourseCode;

public class Student {
	public String firstName;
	
	@NotNull(message = "required")
	@Size(min = 3, message = "3-7 characters", max = 7)
	public String lastName;
	public String country;
	public String progLang;
	public String[] smartPhone;
	
	@CourseCode(value = "BITT", message = "must start with BITT")
	public String courseCode;
	
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	@NotNull(message = "required")
	public int freePass;
	


	public int getFreePass() {
		return freePass;
	}
	public void setFreePass(int freePass) {
		this.freePass = freePass;
	}
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
