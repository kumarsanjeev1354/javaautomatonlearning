package JavaBasic;

public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Widening type casting
		int x=5000;
		System.out.println(x);
		long y=x;
		System.out.println(y);
		double z=y;
		System.out.println(z);
//		Narrowing Type casting
		float a=200.500f;
		System.out.println(a);
		long b=(long)a;
		System.out.println(b);
		int c=(int)b;
		System.out.println(c);
		
	}

}
