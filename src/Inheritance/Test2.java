//Case 2
//static polymorphism

package Inheritance;

public class Test2 {
	public static void main(String[] args) {
		B b=new B();
		System.out.println(b.x);
		System.out.println(b.y);
		System.out.println(b.z);
		
		b.m1();
		b.m2();
		b.m3();
	}
}
