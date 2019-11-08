package com.systemexe.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeRoleTest {

	public static void main(String[] args) {	
		EmployeeRoleTest employee = new EmployeeRoleTest();
		ArrayList<Employee> ListEmployee = employee.createSampleData();
		
		System.out.println("Danh sach nhan vien:");
		for (int i = 0; i < ListEmployee.size(); i++) {
			System.out.println(ListEmployee.get(i).getName());
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ten de hien thi chuc vu: ");
		String employeeName = scanner.nextLine();
		scanner.close();
		
		List<String> employeeRole = employee.findEmployeeRoleByName(ListEmployee, employeeName);
		System.out.println(employeeName + ":" + employeeRole);
	}

	private ArrayList<Employee> createSampleData() {
		Employee employee1 = new Employee("Name1", "Project Manager");
		Employee employee2 = new Employee("Name2", "Business Analyst");
		Employee employee3 = new Employee("Name3", "Developer");
		Employee employee4 = new Employee("Name4", "Developer");
		Employee employee5 = new Employee("Name3", "Tester");
		
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
		employeeList.add(employee5);

		return employeeList;

	}

	private List<String> findEmployeeRoleByName(ArrayList<Employee> list, String employeeName) {
		List<String> employeeRoleList = new ArrayList<String>();
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().equals(employeeName)) {
				employeeRoleList.add(list.get(i).getRole());
			}
		}
		
		return employeeRoleList;
	}
}
