package com.kalia.practice;
class test{
	test show() {
		System.out.println("parent class");
		return this;
	}
}
class Test2 extends test{
	Test2 show() {
		super.show();
		System.out.println("child class");
		return this;
	}
}
public class Testing {

	public static void main(String[] args) {
	Test2 t1=new Test2();
	t1.show();
	}

}
