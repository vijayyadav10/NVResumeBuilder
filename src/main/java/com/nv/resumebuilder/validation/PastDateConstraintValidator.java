package com.nv.resumebuilder.validation;

import java.sql.Date;
import java.time.LocalDate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PastDateConstraintValidator implements ConstraintValidator<PastDate, Date> {

	@Override
	public boolean isValid(Date value, ConstraintValidatorContext context) {

		Date currentDate = Date.valueOf(LocalDate.now());

		int currentYear = currentDate.getYear();
		int checkYear = value.getYear();

		if (value != null && checkYear >= currentYear) {
			return false;
		}

		return true;
	}

}
