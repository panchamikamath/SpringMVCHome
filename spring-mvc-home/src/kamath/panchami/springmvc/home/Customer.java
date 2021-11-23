package kamath.panchami.springmvc.home;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {

	@NotNull(message="FirstName can not be empty or  less than one character!")
	@Size(min=1,message="FirstName can not be empty or  less than one character!")
	private String firstName;
	
	@NotNull(message="LastName can not be empty or less than one character!")
	@Size(min=1,message="LastName can not be empty or less than one character!")
	private String lastName;
	
	@NotNull(message="Required field")
	@Min(value=0, message="must be greater than or equal to zero")
	@Max(value=10, message="must be lesser than or equal to ten")
	private Integer freePasses;
	
	@Pattern(regexp="^[A-za-z0-9]{5}",message="Only 5 characters/digits allowed")
	private String postalCode;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
}
