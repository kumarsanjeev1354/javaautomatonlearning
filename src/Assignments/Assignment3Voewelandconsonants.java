package Assignments;

import java.util.Scanner;

public class Assignment3Voewelandconsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Check is the character enter is Vowel or Consonants
		char  a;
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the value of character=");
	    a=sc.next().charAt(0);
	    if(a=='A'  || a=='a' || a=='E' || a=='e')
	    {
	    	System.out.println("Enter character is vowel and value of character is"+" "+a);
	    }
	    else
	    {
	    	System.out.println("Entered character is consonants and value of character is"+" "+a);
	    }
	    
		
	}

}
