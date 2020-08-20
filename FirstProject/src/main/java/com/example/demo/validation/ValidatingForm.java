package com.example.demo.validation;


import org.springframework.stereotype.Service;

@Service
public class ValidatingForm {
	public void validatingtheform(String studentname,int studentage) {
		studentname= studentname.replaceAll(" ","");
		studentname=studentname.toLowerCase();
		 char[] charArray = studentname.toCharArray();
		 for (int i = 0; i < charArray.length; i++) {
			 char ch = charArray[i];
	         if (!(ch >= 'a' && ch <= 'z')) {
	            System.out.println("False");
	            break;
	         }
		 }
		 if(studentage>15) {
				System.out.println("Age is greater than 15");
			}	
	}
	
}
