package com.systemexe.test;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeRoleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeRoleTest employee = new EmployeeRoleTest();
		ArrayList<Employee> ListEmployee = employee.CreateSampleData();
		System.out.println("Danh sach nhan vien:");
		for (int i = 0; i < ListEmployee.size(); i++) {
			System.out.println(ListEmployee.get(i).getName());
		}
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ten de hien thi chuc vu: ");
		 String Name = scanner.nextLine();
		 scanner.close();
		String Role= employee.findEmployeeRoleByName(ListEmployee, Name);
		 System.out.println(Role);
	}
	public ArrayList<Employee> CreateSampleData(){
		Employee Employee1 = new Employee("Name1","GD");
		Employee Employee2 = new Employee("Name2","PGD");
		Employee Employee3 = new Employee("Name3","NV");
		ArrayList<Employee> ListEmployee = new ArrayList<Employee>();
		ListEmployee.add(Employee1);
		ListEmployee.add(Employee2);
		ListEmployee.add(Employee3);
		
		return ListEmployee;
	    
	}
	public String findEmployeeRoleByName(ArrayList<Employee> list, String Name) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().equals(Name)) {
				return list.get(i).getRole();
			}
		}
		return "Not Found";
	}
}
