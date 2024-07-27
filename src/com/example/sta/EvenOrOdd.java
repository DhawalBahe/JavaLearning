package com.example.sta;

import java.util.Scanner;

public class EvenOrOdd {

	int result;

	void evenOdd(int i) {
		for (int a = 0; a <= i; a++) {
			if (a % 2 == 0) {
				System.out.println("this vaue is even" + a);
			} else {
				System.out.println("this vaue is odd" + a);
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number here");
		int number = sc.nextInt();

		EvenOrOdd numberTable = new EvenOrOdd();
		numberTable.evenOdd(number);

	}

}
