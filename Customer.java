import java.util.*;
public class Customer extends Account implements Validation{
    String Name;
    String Username;
    String Password;
    int Age;
    String SSN;
    String Address;
    String Email;
    String  phone;
    float Balance=500;
	public void display()
	   {
		System.out.println("Your details are  : ");
		System.out.println("Username= "+Name+" Age = "+Age+" SSN Number = "+SSN +" Phone No. : "+phone);
		

	   }

	   public void validateAge(int x){
		   if(x>=18)
			  System.out.println("You are Allowed to open Account as your age is above 18.");
		   else
			   System.out.println("Sorry!! YOu are not allowed to open account as your age is below 18.");
	    }

	   public void validateSSN(String str){
		   if(str.length()==9)
			   System.out.println("Entered SSN Is  valid. ");
		   else
			   System.out.println("Entered SSN number is not valid.");
	   }
}
