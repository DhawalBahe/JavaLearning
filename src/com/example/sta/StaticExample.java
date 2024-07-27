package com.example.sta;

public class StaticExample {

	static int id = 1;
	static String name = "pratiksha";
	static String schoolName = "DPS";

//	public StaticExample(int id, String name) {
//		super();
//		this.id = id;
//		this.name = name;
//	}

	static void display() {
		System.out.println("this is display method :" + id + " and " + name + " and " + schoolName);
	}

	static {
		System.out.println("this is static block");
	}
	
	public static void main(String[] args) {

//		staticExample staticExample = new staticExample(101, "pratiksha");
//		staticExample staticExample1 = new staticExample(102, "Dhawal");
//		staticExample staticExample2 = new staticExample(103, "Mayuri");
		
//		staticExample.display();
//		staticExample1.display();
//		staticExample2.display();
		
		StaticExample.display();
		StaticExample.display();
		StaticExample.display();
		StaticExample.display();
		StaticExample.display();
		StaticExample.display();
		StaticExample.display();
		
	}
}
