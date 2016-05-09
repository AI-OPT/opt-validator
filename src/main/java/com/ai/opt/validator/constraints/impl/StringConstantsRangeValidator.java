package com.ai.opt.validator.constraints.impl;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.ai.opt.validator.constraints.StringConstantsRange;

public class StringConstantsRangeValidator implements
        ConstraintValidator<StringConstantsRange, String> {

    private String[] constants;

    @Override
    public void initialize(StringConstantsRange constraintAnnotation) {
        constants = constraintAnnotation.constants();
        validateParameters();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null || "".equals(value.trim())) {
            return true;
        }
        for (String c : constants) {
            if (value.equals(c)) {
                return true;
            }
        }
        return false;
    }

    private void validateParameters() {
        if (constants == null) {
            throw new IllegalArgumentException("The constants parameter cannot be null.");
        }
        if (constants.length == 0) {
            throw new IllegalArgumentException("The constants parameter length cannot be zero.");
        }
    }

}
