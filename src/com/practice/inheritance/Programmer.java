package com.practice.inheritance;

public class Programmer extends Employee {

	int bonus;

	public Programmer(int id, int salary, int bonus) {
		super(id, salary);
		this.bonus = bonus;
	}

	public void display() {

		System.out.println(id + "	" + salary);

		System.out.println(id + "	" + salary + "	" + bonus);
	}
}


//Shivendra@1711