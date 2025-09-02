package com.kalia.overiding_concept;
class Animal{
	public void eating() {
		System.out.println("generic");
	}
}
class Dog extends Animal{
//	public void eating() {
//		System.out.println("specific");
//	}
}
public class OverridingDemo1 {

	public static void main(String[] args) {
		Animal ab=new Dog();
		ab.eating();

	}

}
