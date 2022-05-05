package com.perscholas.db.main;

import java.sql.SQLException;
import java.util.List;
  
import com.perscholas.db.dao.EmployeeDaoImplementation;
import com.perscholas.db.model.Employee;
  
public class Application {
  
    public static void main(String[] args)
        throws SQLException
    {
  
        Employee emp = new Employee();
        emp.setEmp_name("Haider");
        emp.setEmp_address("Mars");
        EmployeeDaoImplementation empDao
            = new EmployeeDaoImplementation();
  
        // add
        empDao.add(emp);
  
        // read
        Employee e = empDao.getEmployee(6);
        System.out.println(e.getEmp_id() + " "
                           + e.getEmp_name() + " "
                           + e.getEmp_address());
  
        // read All
        List<Employee> ls = empDao.getEmployees();
        for (Employee allEmp : ls) {
            System.out.println(allEmp);
        }
  
        // update
        Employee tempEmployee = empDao.getEmployee(2);
        tempEmployee.setEmp_address("Asgard");
        empDao.update(tempEmployee);
        
        // delete
//        empDao.delete(1);
        
        List<Employee> employees = empDao.getEmployees();
        System.out.println("All employees are");
        for (Employee allEmp : employees) {
            System.out.println(allEmp);
        }
    }
}