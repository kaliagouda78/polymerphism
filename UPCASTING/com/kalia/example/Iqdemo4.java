package com.kalia.example;

class vehicle1 {
    public int capacity() {
        return 80;
    }

    public void printTankCapaCity() {
        System.out.println(this.capacity());
    }
}

class car1 extends vehicle1 {
    @Override
    public int capacity() {
        return 64;
    }

    @Override
    public void printTankCapaCity() {
        System.out.println(super.capacity());
    }
}

public class Iqdemo4 {
    public static void main(String[] args) {
        vehicle1 v = new car1();
        v.printTankCapaCity();  // prints 80
    }
}
