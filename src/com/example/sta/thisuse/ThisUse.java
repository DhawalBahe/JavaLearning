package com.example.sta.thisuse;

public class ThisUse {

	int id;
	String name;
	int fees;

	ThisUse(int id, String name) {
		this.id = id;
		this.name = name;
	}

	ThisUse(int id, String name, int fees) {
		this(id, name);
		this.fees = fees;
	}

	void m1() {
		System.out.println("this is my m1 method");
	}

	void m2() {
		this.m1();
		System.out.println("this is my id :" + id + " and my name is :" + name);
//		m1();
	}

	public static void main(String[] args) {

		ThisUse main = new ThisUse(101, "pratiksha");
		main.m2();

	}
}