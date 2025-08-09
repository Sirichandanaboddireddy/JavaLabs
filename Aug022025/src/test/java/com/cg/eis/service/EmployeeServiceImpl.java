package com.cg.eis.service;

import com.cg.eis.bean.Employee;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public void getEmployeeDetails(Employee emp) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        emp.setId(sc.nextInt());

        sc.nextLine(); 

        System.out.print("Enter Employee Name: ");
        emp.setName(sc.nextLine());

        System.out.print("Enter Employee Salary: ");
        emp.setSalary(sc.nextDouble());

        sc.nextLine();

        System.out.print("Enter Employee Designation: ");
        emp.setDesignation(sc.nextLine());
    }

    @Override
    public String findInsuranceScheme(Employee emp) {
        double salary = emp.getSalary();
        String designation = emp.getDesignation();

        if (salary > 50000 && designation.equalsIgnoreCase("Manager")) {
            emp.setInsuranceScheme("Scheme A");
        } else if (salary > 30000 && salary <= 50000 && designation.equalsIgnoreCase("Programmer")) {
            emp.setInsuranceScheme("Scheme B");
        } else if (salary > 20000 && salary <= 30000 && designation.equalsIgnoreCase("System Associate")) {
            emp.setInsuranceScheme("Scheme C");
        } else {
            emp.setInsuranceScheme("No Scheme");
        }

        return emp.getInsuranceScheme();
    }

    @Override
    public void displayEmployeeDetails(Employee emp) {
        System.out.println("\n===== Employee Details =====");
        System.out.println(emp.toString());
    }
}
