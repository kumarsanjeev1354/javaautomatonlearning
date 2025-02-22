package JavaBasic;

import java.util.Scanner;

public class Scannerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the values");
int a=sc.nextInt();
String b=sc.next();
double c=sc.nextDouble();
byte d=sc.nextByte();//Next is method of sc class to access it
boolean e=sc.nextBoolean();
System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
System.out.println(e);
	}

}
