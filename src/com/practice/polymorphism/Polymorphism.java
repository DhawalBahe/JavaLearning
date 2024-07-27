package com.practice.polymorphism;

public class Polymorphism { // method overloading

	int add() {
		return 0;
	}

	int add(int a, int b) {
		return a + b;
	}

	float add(int a, float b) {
		return a + b;
	}

	int add(int a, int b, int c) {
		return a + b + c;
	}
}
