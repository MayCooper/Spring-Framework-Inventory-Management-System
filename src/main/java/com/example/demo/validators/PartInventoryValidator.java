package com.example.demo.validators;

import com.example.demo.domain.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PartInventoryValidator implements ConstraintValidator<ValidPartInventory, Part> {
    @Autowired
    private ApplicationContext context;

    @Override
    public void initialize(ValidPartInventory constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {
        if (part == null) return true;  // null check for safety

        boolean valid = true;

        if (part.getInv() < part.getMinimum()) {
            constraintValidatorContext.disableDefaultConstraintViolation();
            constraintValidatorContext.buildConstraintViolationWithTemplate("Inventory must not be less than minimum value")
                    .addPropertyNode("inv")
                    .addConstraintViolation();
            valid = false;
        }

        if (part.getInv() > part.getMaximum()) {
            constraintValidatorContext.disableDefaultConstraintViolation();
            constraintValidatorContext.buildConstraintViolationWithTemplate("Inventory must not exceed maximum value")
                    .addPropertyNode("inv")
                    .addConstraintViolation();
            valid = false;
        }

        return valid;
    }
}
