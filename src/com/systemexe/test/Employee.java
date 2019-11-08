package com.systemexe.test;

public class Employee extends Person{
	public String role;
	
	public Employee(String name, String role) {
		super(name);
		this.role = role;
	}

	public String getRole() {
        return this.role;
    }
	
}
