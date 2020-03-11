package id.ac.ui.cs.advprog.tutorial3.composite.techexpert;
import id.ac.ui.cs.advprog.tutorial3.composite.Employees;
import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

public class UiUxDesigner extends Employees {
    public UiUxDesigner(String name, double salary) {
        this.name = name;
        this.role = "UI/UX Designer";
        if (salary < 90000) {
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
