package com.ai.opt.validator.test;

import org.hibernate.validator.constraints.Email;

import com.ai.opt.validator.constraints.MobilePhone;
import com.ai.opt.validator.constraints.StringEnum;

public class Person {

    @Email(message = "邮箱格式不正确")
    private String email;

    @StringEnum(enumClazz = GenderEnum.class, message = "性别必须是Female|Male|Other")
    private String sex;

    @MobilePhone(message = "电话格式不正确")
    private String phone;

    public Person(String email, String sex, String phone) {
        this.email = email;
        this.sex = sex;
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
