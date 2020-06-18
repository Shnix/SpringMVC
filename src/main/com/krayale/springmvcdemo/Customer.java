package krayale.springmvcdemo;

import krayale.springmvcdemo.validation.CourseCode;
import lombok.Data;

import javax.validation.constraints.*;

@Data
public class Customer {

    @Min(value = 0, message = "must be greater than or equal to zero")
    @Max(value = 10,message = "must be less than or equal to 10")
    private int freePasses;

    private String firstName;

    @NotNull(message = "is required")
    @Size(min = 1,message = "is required")
    private String lastName;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars/digits")
    private String postalCode;

    @CourseCode(value = "WTF", message = "must start with WTF")
    private String courseCode;
}
