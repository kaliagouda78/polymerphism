package com.kalia.example;
class bird{
	public void roam() {
		System.out.println("generic birds is roaming");
	}
	public void fly() {
		System.out.println("generic bird is flying");
	}
}
class parrot extends bird{
	public void roam() {
		System.out.println("specific birds is roaming");
	}
	public int fly(int height) {
		System.out.println("parrot id flying in the sky at"+height+"feet");
		return 0;
	}
	
}
public class iqdemo5 {

	public static void main(String[] args) {
		parrot b=new parrot();
		b.roam();
		b.fly(132);
	}

}
