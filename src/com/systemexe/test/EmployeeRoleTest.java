package com.systemexe.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeRoleTest {

	public static void main(String[] args) {
		EmployeeRoleTest employee = new EmployeeRoleTest();
		ArrayList<Employee> employeeList = employee.createSampleData();

		System.out.println("Employee List:");
		for (int i = 0; i < employeeList.size(); i++) {
			System.out.println(employeeList.get(i).getName());
		}

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a name: ");
		String employeeName = scanner.nextLine();
		scanner.close();

		if (!employeeName.equals("")) {
			List<String> employeeRole = employee.findEmployeeRoleByName(employeeList, employeeName);
			System.out.println(employeeName + ":" + employeeRole);
		} else {
			System.out.println("Name is empty");
		}
		
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
