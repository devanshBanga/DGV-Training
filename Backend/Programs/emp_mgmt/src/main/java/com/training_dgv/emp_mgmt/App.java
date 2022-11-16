package com.training_dgv.emp_mgmt;

import controllers.DepartmentController;
import controllers.EmployeeController;
import models.Department;
import models.Employee;

public class App 
{
    public static void main( String[] args )
    {
//        DepartmentController departmentController = new DepartmentController();
//        Department department = departmentController.getSingleData(1);
EmployeeController employeeController = new EmployeeController();

employeeController.displayEmployeeData(1);
    }
}
