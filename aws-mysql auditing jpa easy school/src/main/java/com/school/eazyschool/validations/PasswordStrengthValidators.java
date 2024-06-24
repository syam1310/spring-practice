package com.school.eazyschool.validations;

import com.school.eazyschool.annotation.FieldsValueMatch;
import com.school.eazyschool.annotation.PasswordValidator;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.List;

public class PasswordStrengthValidators implements ConstraintValidator<PasswordValidator, String> {

    List<String> weekPasswords;
    @Override
    public void initialize(PasswordValidator constraintAnnotation) {
       weekPasswords = Arrays.asList("12345", "123", "password", "qwerty");
    }

    @Override
    public boolean isValid(String passwordField, ConstraintValidatorContext constraintValidatorContext) {
        return passwordField != null && (!weekPasswords.contains(passwordField));
    }
}
