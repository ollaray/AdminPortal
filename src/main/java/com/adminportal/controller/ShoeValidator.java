package com.adminportal.controller;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.adminportal.entity.Shoe;

@Component
public class ShoeValidator implements Validator {

	@Override
	public boolean supports(Class<?> aClass) {
		return Shoe.class.equals(aClass);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		Shoe shoe = (Shoe) obj;
		
		ValidationUtils.rejectIfEmpty(errors, "title", "NotEmpty");
		if(shoe.getTitle() == null) {
			errors.rejectValue("title", "Title field is compulsory");
		}
		
		ValidationUtils.rejectIfEmpty(errors, "description", "NotEmpty");
		if(shoe.getTitle() == null) {
			errors.rejectValue("description", "Description field is compulsory");
		}
		
		ValidationUtils.rejectIfEmpty(errors, "category", "NotEmpty");
		if(shoe.getTitle() == null) {
			errors.rejectValue("category", "Category field is compulsory");
		}
		
		ValidationUtils.rejectIfEmpty(errors, "listPrice", "NotEmpty");
		if(shoe.getTitle() == null) {
			errors.rejectValue("listPrice", "List Price field is compulsory");
		}
		ValidationUtils.rejectIfEmpty(errors, "ourPrice", "NotEmpty");
		if(shoe.getTitle() == null) {
			errors.rejectValue("ourPrice", "Our Price field is compulsory");
		}
		
		ValidationUtils.rejectIfEmpty(errors, "shippingWeight", "NotEmpty");
		if(shoe.getTitle() == null) {
			errors.rejectValue("shippingWeight", "Shipping Weight field is compulsory");
		}
	}

}
