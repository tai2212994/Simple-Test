package com.systemexe.test;

public class Employee extends Person{
	public String Role;
	public Employee(String PersonName, String Role) {
		super(PersonName);
		// TODO Auto-generated constructor stub
		this.Role = Role;
	}

	public String getRole() {
        return this.Role;
    }
	
}
