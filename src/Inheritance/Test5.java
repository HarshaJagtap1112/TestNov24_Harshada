//Case 5
//Dynampic polymorphism case 3
package Inheritance;

public class Test5 {
	public static void main(String[] args) {
		A a=new A();
		B b=new B();
		a=b;
		
		System.out.println(a.x);
		System.out.println(a.y);
		//System.out.println(a.z);
		
		a.m1();
		a.m2();
		//a.m3();
	}
}
