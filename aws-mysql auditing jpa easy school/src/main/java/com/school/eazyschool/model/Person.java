package com.school.eazyschool.model;

import com.school.eazyschool.annotation.FieldsValueMatch;
import com.school.eazyschool.annotation.PasswordValidator;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Data
@Entity
@FieldsValueMatch.List({
        @FieldsValueMatch(
                field = "pwd",
                fieldMatch = "confirmPwd",
                message = "Password do not match"
        ),
        @FieldsValueMatch(
                field = "email",
                fieldMatch = "confirmEmail",
                message = "Email do not match"
        )
})
public class Person extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int personId;
    @NotBlank(message = "Name must not be blank!!")
    @Size(min = 3, message = "Name must be at least 3 character long")
    private String name;
    @NotBlank(message = "Mobile Number must not be blank")
    @Min(value = 10, message = "Mobile Number must be 10 digit")
    @Max(value = 10, message = "Mobile Number must be 10 digit")
    private String mobileNumber;
    @NotBlank(message = "Email must not be blank")
    @Email(message = "Please provide the valid email address")
    private String email;
    @NotBlank(message = "Confirm email must not be blank")
    @Email(message = "Please provide the valid confirm email address")
    @Transient
    private String confirmEmail;
    @NotBlank(message = "Password must not be blank")
    @Size(min = 5, message = "Please provide at least 5 digit long password")
    @PasswordValidator
    private String pwd;
    @NotBlank(message = "Confirm password must not be blank")
    @Size(min = 5, message = "Please provide at least 5 digit long confirm password")
    @Transient
    private String confirmPwd;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST, targetEntity = Roles.class)
    @JoinColumn(name = "role_id", referencedColumnName = "roleId", nullable = false)
    private Roles roles;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, targetEntity = Address.class)
    @JoinColumn(name = "address_id", referencedColumnName = "addressId", nullable = false)
    private Address address;

}
