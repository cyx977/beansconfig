package com.santosh.mvc.validation.courseValidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {
	
	private String courseCode;

	@Override
	public void initialize(CourseCode courseCode) {
		this.courseCode = courseCode.value();
	}

	@Override
	public boolean isValid(String code, ConstraintValidatorContext context) {
		boolean result;
		System.out.println("validator bata code"+ code);
		if(code != null) {
			result = code.startsWith(courseCode);
		}else {
			result = true;
		}
		return result;
	}

}
