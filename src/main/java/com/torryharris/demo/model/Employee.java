package com.torryharris.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

	@Id // primary key
//	@GeneratedValue(strategy = GenerationType.IDENTITY) // value generated automatically 1, 2, 3, ...
	@GeneratedValue(strategy = GenerationType.AUTO) // value generated automatically 1, 2, 3, ...
	private int employeeId;

	private String firstName;

	private double salary;

	public Employee() {
		super();
	}

	public Employee(String firstName, double salary) {
		super();
		this.firstName = firstName;
		this.salary = salary;
	}

	public Employee(int employeeId, String firstName, double salary) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee{" + "employeeId=" + employeeId + ", firstName='" + firstName + '\'' + ", salary=" + salary
				+ '}';
	}
}
