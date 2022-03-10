import java.util.*;
import java.io.IOException;

public class WhatToEat {
	

	public static void main(String[] args) throws IOException
	{
		System.out.println("Enter the password:");
		// boolean variable storing the validation of password
		boolean passwordTrue=true;
		try (Scanner sc = new Scanner(System.in)) {
			//	entering the password
				var passwd = sc.nextLine();
				
			// check if length is less than 8
				if(passwd.length()<7) {
					passwordTrue=false;
					System.out.println("Minimum length should be 7 Characters");
				}
			//	check if the password has at least 1 lower case character
				if(passwd.matches(".*[a-z].*")==false) {
					passwordTrue=false;
					System.out.println("Password does not have lower case characters");
				}
			// 	check if the password has at least 1 upper case character
				if(passwd.matches(".*[A-Z].*")==false) {
					passwordTrue=false;
					System.out.println("Password does not have upper case characters");
				}
			// check if the password has exclamation character
				if(passwd.contains("!")==false) {
					passwordTrue=false;
					System.out.println("password should have an exclamaition character");
				}
			// check if length is greater than 12
				if(passwd.length()>12) {
					passwordTrue=false;
					System.out.println("Maximum length is 12 characters");
				}
		}
	// print password valid if password meets requirements.
		if(passwordTrue) {
			System.out.println("password Valid and accepted");
		}
		else {
			System.out.println("Error");
		}
		}
	}
