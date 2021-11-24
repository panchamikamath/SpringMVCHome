package kamath.panchami.springmvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String>{

	//private String coursePrefix;
	private String[] coursePrefixes;
	
	@Override
	public void initialize(CourseCode theCourseCode) {
		//coursePrefix = theCourseCode.value();
		coursePrefixes = theCourseCode.value();
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext constraintValidatorContext) {
		
		boolean result = false;
		
		/*if(theCode!=null) {
			result = theCode.startsWith(coursePrefix);
		}
		else {
			result = true;
		}*/
		
		if(theCode!=null) {
			for(String tempPrefix : coursePrefixes) {
				result = theCode.startsWith(tempPrefix);
				if(result) {
					break;
				}
			}
		}
		
		return result;
	}


}
