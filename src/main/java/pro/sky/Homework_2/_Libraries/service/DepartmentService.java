package pro.sky.Homework_2._Libraries.service;

import pro.sky.Homework_2._Libraries.model.Employee;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface DepartmentService {
    Employee getEmployeeWithMaxSalary(Integer departmentId);
    Employee getEmployeeWithMinSalary(Integer departmentId);
    Collection<Employee> getEmployee(Integer departmentId);
    Map<Integer, List<Employee>> getEmployee();
}