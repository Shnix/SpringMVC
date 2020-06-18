package krayale.springmvcdemo.validation;

import krayale.springmvcdemo.validation.CourseCode;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

   private String coursePrefix;

   @Override
   public void initialize(CourseCode constraint) {
      coursePrefix = constraint.value();
   }

   @Override
   public boolean isValid(String code, ConstraintValidatorContext context) {

      boolean result;

      if(code != null){
         result = code.startsWith(coursePrefix);
      }
      else {
         return true;
      }
      return result;
   }
}
