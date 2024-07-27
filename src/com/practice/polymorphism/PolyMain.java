package com.practice.polymorphism;

public class PolyMain {
	
	public static void main(String[] args) {

		System.out.println("this is main method with String");

		Polymorphism polymorphism = new Polymorphism();

		int result = polymorphism.add();
		System.out.println(result);
		
		int a = polymorphism.add(10, 100);

		float b = polymorphism.add(10, 10);

		int c = polymorphism.add(10, 10, 10);

		System.out.println(a);
		System.out.println("                          ");
		System.out.println(b);
		System.out.println("                           ");
		System.out.println(c);
	}

	public static void main(int[] args) {

		System.out.println("this is main method with int");

		Polymorphism polymorphism = new Polymorphism();

		int a = polymorphism.add(10, 100);

		float b = polymorphism.add(10, 10);

		int c = polymorphism.add(10, 10, 10);

		System.out.println(a);
		System.out.println("                          ");
		System.out.println(b);
		System.out.println("                           ");
		System.out.println(c);
	}
}
