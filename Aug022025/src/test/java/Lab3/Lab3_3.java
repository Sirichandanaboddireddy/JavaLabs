package Lab3;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.EmployeeServiceImpl;

public class Lab3_3 {

    public static void main(String[] args) {

        try {
           
            Employee employee = new Employee(111, "Siri", 1000, "Tester");

            
            EmployeeService es = new EmployeeServiceImpl();

            
            String scheme = es.findInsuranceScheme(employee);

            
            employee.setInsuranceScheme(scheme);

            
            es.displayEmployeeDetails(employee);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
