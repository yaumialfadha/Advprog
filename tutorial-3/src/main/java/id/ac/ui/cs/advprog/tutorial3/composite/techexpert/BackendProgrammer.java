package id.ac.ui.cs.advprog.tutorial3.composite.techexpert;
import id.ac.ui.cs.advprog.tutorial3.composite.Employees;

public class BackendProgrammer extends Employees {
    public BackendProgrammer(String name, double salary) {
        this.name = name;
        this.role = "Back End Programmer";
        if (salary < 20000) {
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
