package id.ac.ui.cs.advprog.tutorial3.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;



public class Company {
    protected List<Employees> employeesList;

    public Company() {
        employeesList = new ArrayList<Employees>();
    }

    public Company(List<Employees> employeesList) {
        Collections.copy(this.employeesList, employeesList);
    }

    public void addEmployee(Employees employees) {
        employeesList.add(employees);
    }

    public double getNetSalaries() {
        double ret = 0.0;
        for (Employees employee : employeesList) {
            ret += employee.getSalary();
        }
        return ret;
    }

    public List<Employees> getAllEmployees() {
        List<Employees> allEmployees = new ArrayList<Employees>();
        for (Employees employee : employeesList) {
            allEmployees.add(employee);
        }
        return allEmployees;
    }
}
