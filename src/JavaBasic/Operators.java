package JavaBasic;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Arthematic Operators =,-,/,*,%
		int x=50,y=30;
		int z=x+y;
	/*
		System.out.println(z);
	System.out.println(x+y);
	System.out.println(50+30);
	System.out.println("Difference of x and y is"+" " +(x-y));
	System.out.println("Product of x and y is"+ " " +(x*y));
	System.out.println("Division of x and y is"+ " "+ (x/y));// Need to check this
	System.out.println("Modular of x and y is"+" "+ (x%y));
//	Relational or Comparison Operator
//	It's return type will be boolean
	System.out.println(x>y);//true
	System.out.println(x<y);
	System.out.println(x>=y);
	System.out.println(x<=y);
	System.out.println(x!=y);//true
	System.out.println(x==y);//false
	*/
//	Logical Operators 
//	It's return type will also be boolean
	/*boolean a= true;
	boolean b= false;
	System.out.println(a && b);
	System.out.println(a||b);
	System.out.println(!a);
	System.out.println(!b);
	
	boolean b1=x>y;//true as 50 is greater than 30
	boolean b2=x!=y;//true as 50 is not equal to 30
	System.out.println(b1 && b2);//true
	System.out.println(b1 || b2);//true*/
	
//	Increment and Decrement operator
//	Increment operator
		/*int p=20;//20
		System.out.println(p);//20
		p++;
		System.out.println(p);
		
		
		int q=p++;
		System.out.println(q);
		System.out.println(p);*/
//		Decrement Operator
		
		int p=20;//20
		System.out.println("value of p is"+p);//value 20
		p--;//value 19
		System.out.println("value of p after post decrement is"+p);//value 19
		p--;//value 19
		int q=p--;//value of p is 18 and then assigned to q that is again 18
		System.out.println("value of q after post p decrement"+q);//value 18
		System.out.println("value of p post decrement"+p);//value 18
		--q;//17
		int r=--q;//value 
		System.out.println("value of r before after pre decrement"+r);//17
		System.out.println("Value of q after pre decrement"+q);//17
		
	
	}

}
