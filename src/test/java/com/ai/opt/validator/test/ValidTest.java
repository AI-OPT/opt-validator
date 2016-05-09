package com.ai.opt.validator.test;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

public class ValidTest {

    public static void main(String[] args) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Person person = new Person("zhang@asiainfo.com", "男1", "18601179442");
        Set<ConstraintViolation<Person>> constraintViolations = validator.validate(person);
        System.out.println(constraintViolations);

    }

}
