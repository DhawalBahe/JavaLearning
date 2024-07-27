package com.practice.inheritance;

public class Employee {

	int id;
	int salary;

	public Employee(int id, int salary) {
		super();
		this.id = id;
		this.salary = salary;
	}

	public void display() {
		System.out.println(id + "	" + salary);
	}

}
