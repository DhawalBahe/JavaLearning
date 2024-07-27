package com.example.sta;

import java.util.Scanner;

public class NumberTable {

	int result;

	void printable(int i) {

		for (int a = 1; a <= 10; a++) { 
			result = i * a;
			System.out.println(i + "*" + a + "=" + result);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number here");
		int number = sc.nextInt();
		String name = sc.next();

		NumberTable numberTable = new NumberTable();
		numberTable.printable(number);
		System.out.println(name);
	}

}
