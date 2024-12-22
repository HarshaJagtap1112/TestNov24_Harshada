package p2;

import p1.Test1;

public class Test2 extends Test1 {
	private long money=10L; 
	
	public static void main(String[] args) {
		Test2 test2=new Test2();
		test2.m3();
		System.out.println(test2.money); 
	}
}
