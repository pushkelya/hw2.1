package com.groupqal;

public class Main {

    public static void main(String[] args) {
	int a = 5;
	int b = 3;
	a = a + b - (b = a);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
