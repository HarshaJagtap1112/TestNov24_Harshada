package Inheritance.P2;
import Inheritance.P1.*;
public class Test {
	
	public static void main(String[] args) {
		A a=new B();
		//a.m1(); m1 method is not visible to Test class it is having default access which is not visible outside package.
	}
	
	
}
