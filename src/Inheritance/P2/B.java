package Inheritance.P2;

import Inheritance.P1.*;
public class B extends A{
	int y = 20;
	int z = 30;
	
	void m2(){
		B a=new B();
		System.out.println(a.x+a.y);
	}
	
	void m3(){
		System.out.println("B m3");
	}
}