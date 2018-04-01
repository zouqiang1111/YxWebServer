package com.zouqiang.controller;

import com.zouqiang.entity.User4;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class User4Validater implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return User4.class.equals(clazz);
    }

    @Override
    public void validate(Object object, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "username", null, "用户名不能为空");
        ValidationUtils.rejectIfEmpty(errors, "sex", null, "性别不能为空");
        ValidationUtils.rejectIfEmpty(errors, "age", null, "年龄不能为空");
        ValidationUtils.rejectIfEmpty(errors, "password", null, "密码不能为空");
    }
}
