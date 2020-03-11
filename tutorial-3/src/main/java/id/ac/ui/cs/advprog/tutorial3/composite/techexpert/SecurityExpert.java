package id.ac.ui.cs.advprog.tutorial3.composite.techexpert;

import id.ac.ui.cs.advprog.tutorial3.composite.Employees;

public class SecurityExpert extends Employees {
    public SecurityExpert(String name, double salary) {
        this.name = name;
        this.role = "Security Expert";
        if (salary < 70000) {
            throw new IllegalArgumentException();
        } else {
            this.salary = salary;
        }
    }

    @Override
    public double getSalary() {
        return this.salary;
    }
}