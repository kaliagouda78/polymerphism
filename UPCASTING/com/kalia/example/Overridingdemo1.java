package com.kalia.example;
class Super{
	private void m1() {
		System.out.println("this sub class");
	}
}
class Sub extends Super{
	public void m1() {
		System.out.println("this sub class");
	}
}
public class Overridingdemo1 {

	public static void main(String[] args) {
	Super s=new Sub();
	//s.m1(); compilation error becouse super class mathod is private
	}

}
