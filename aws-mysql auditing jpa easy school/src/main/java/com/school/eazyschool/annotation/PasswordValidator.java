package com.school.eazyschool.annotation;

import com.school.eazyschool.validations.FieldsValueMatchValidators;
import com.school.eazyschool.validations.PasswordStrengthValidators;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Constraint(validatedBy = PasswordStrengthValidators.class)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
//@Repeatable(FieldsValueMatch.List.class)
public @interface PasswordValidator {
    String message() default "Please choose the strong password!!";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
