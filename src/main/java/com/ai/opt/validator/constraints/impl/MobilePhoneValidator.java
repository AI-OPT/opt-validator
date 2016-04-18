package com.ai.opt.validator.constraints.impl;

import java.util.regex.Matcher;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.ai.opt.validator.constraints.MobilePhone;

/**
 * 移动电话规则校验<br>
 * Date: 2016年4月18日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangchao
 */
public class MobilePhoneValidator implements ConstraintValidator<MobilePhone, String> {

    private static final String MOBILEPHONE_REGEX = "^((13[0-9])|(14[0-9])|(15[^4,\\D])|(18[0,5-9])|(17[0-9]))\\d{8}$";

    private java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(MOBILEPHONE_REGEX,
            java.util.regex.Pattern.CASE_INSENSITIVE);

    @Override
    public void initialize(MobilePhone constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null || value.length() == 0) {
            return true;
        }
        Matcher m = pattern.matcher(value);
        return m.matches();
    }

}
