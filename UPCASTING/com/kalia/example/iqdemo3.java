package com.kalia.example;
class vehicle{
	public int capacity() {
		return 80;
	}
	public void printTankCapaCity() {
		System.out.println(this.capacity());
	}
}
class car extends vehicle {
	public int capacity() {
		return 64;
	}
}

public class iqdemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
vehicle v=new car();
v.printTankCapaCity();
	}

}
