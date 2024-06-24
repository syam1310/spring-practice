package com.school.eazyschool.annotation;


import com.school.eazyschool.validations.FieldsValueMatchValidators;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;

import java.lang.annotation.*;
import java.util.List;

@Constraint(validatedBy = FieldsValueMatchValidators.class)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(FieldsValueMatch.List.class)
public @interface FieldsValueMatch {
    String message() default "Fields value doesn't match!!";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String regexp() default ".*";

    Pattern.Flag[] flags() default {};

    String field();
    String fieldMatch();

    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    public @interface List {
        FieldsValueMatch[] value();
    }

}
