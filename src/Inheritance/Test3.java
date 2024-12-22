//Case3 
//dynamic polymorphism
//behaviour changes from compile time to run time
package Inheritance;

public class Test3 {
	public static void main(String[] args) {
		A a=new B();
		System.out.println(a.x);
		System.out.println(a.y);
		//System.out.println(a.z);
		
		a.m1();
		a.m2();
		//a.m3();
	}
}
