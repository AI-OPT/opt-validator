package com.ai.opt.validator.constraints;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.ai.opt.validator.constraints.impl.StringConstantsRangeValidator;

/**
 * 判断字符串取值是否在一个常量字符串范围内。比如SEX 取值只能是"MAN\WOMAN"<br>
 * Date: 2016年5月9日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 * 
 * @author zhangchao
 */
@Documented
@Constraint(validatedBy = StringConstantsRangeValidator.class)
@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER })
@Retention(RUNTIME)
public @interface StringConstantsRange {

    String message() default "{com.ai.opt.validator.constraints.StringConstantsRange.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    /**
     * 待比较的常量字符串数组
     */
    String[] constants() default {};

    @Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER })
    @Retention(RUNTIME)
    @Documented
    public @interface List {
        StringConstantsRange[] value();
    }

}
