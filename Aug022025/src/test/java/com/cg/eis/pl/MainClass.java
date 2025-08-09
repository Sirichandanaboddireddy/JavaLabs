package com.cg.eis.pl;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.EmployeeServiceImpl;

public class MainClass {
    public static void main(String[] args) {
        Employee emp = new Employee(0, "", 0.0, "");
        EmployeeService service = new EmployeeServiceImpl();

        
        service.getEmployeeDetails(emp);

        
        service.findInsuranceScheme(emp);

        
        service.displayEmployeeDetails(emp);
    }
}
