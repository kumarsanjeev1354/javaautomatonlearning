package Assignments;

import java.util.Scanner;

public class Assignmentquestion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Program to find the smallest of three numbers
		int x,y,z;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x=");
		x=sc.nextInt();
		System.out.println("Enter the value of y=");
		y=sc.nextInt();
		System.out.println("Enter the value of z=");
		z=sc.nextInt();
		if(x<y && x<z)
		{
			System.out.println("x is the smallest and value of x is"+" "+x);
		}
		else if(y<x && y<z)
		{
			System.out.println("Y is the smallest and value of y is"+" "+y);
		}
		else
		{
			System.out.println("z is the samalles and valuet of z is"+" "+z);
		}
		
		
		
	}

}
