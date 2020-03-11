package id.ac.ui.cs.advprog.tutorial3.composite.techexpert;
import id.ac.ui.cs.advprog.tutorial3.composite.Employees;

public class NetworkExpert extends Employees {
    public NetworkExpert(String name, double salary) {
        this.name = name;
        this.role = "Network Expert";
        if (salary < 50000) {
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
