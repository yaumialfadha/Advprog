package id.ac.ui.cs.advprog.tutorial3.composite;

import static org.junit.Assert.assertEquals;

import id.ac.ui.cs.advprog.tutorial3.composite.higherups.*;
import id.ac.ui.cs.advprog.tutorial3.composite.techexpert.*;

import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class CompanyTest {
    private Company company;
    private Ceo luffy;
    private Cto zorro;
    private BackendProgrammer franky;
    private BackendProgrammer usopp;
    private FrontendProgrammer nami;
    private FrontendProgrammer robin;
    private UiUxDesigner sanji;
    private NetworkExpert brook;
    private SecurityExpert chopper;


    @Before
    public void setUp() {
        company = new Company();

        luffy = new Ceo("Luffy", 500000.00);
        company.addEmployee(luffy);

        zorro = new Cto("Zorro", 320000.00);
        company.addEmployee(zorro);

        franky = new BackendProgrammer("Franky", 94000.00);
        company.addEmployee(franky);

        usopp = new BackendProgrammer("Usopp", 200000.00);
        company.addEmployee(usopp);

        nami = new FrontendProgrammer("Nami",66000.00);
        company.addEmployee(nami);

        robin = new FrontendProgrammer("Robin", 130000.00);
        company.addEmployee(robin);

        sanji = new UiUxDesigner("sanji", 177000.00);
        company.addEmployee(sanji);

        brook = new NetworkExpert("Brook", 83000.00);
        company.addEmployee(brook);

        chopper = new SecurityExpert("Chopper", 80000.00);
        company.addEmployee(chopper);
    }

    @Test
    public void addingSomeEmployees() {

        Employees[] arrayEmployeeComparation = {luffy, zorro, franky, usopp, nami,
                                                robin, sanji, brook, chopper};
        List<Employees> allEmployees = company.getAllEmployees();

        for (int index = 0; index < allEmployees.size(); index++) {
            assertEquals(arrayEmployeeComparation[index],allEmployees.get(index));
        }

    }

    @Test
    public void salaryTotalTest() {
        List<Employees> allEmployees = company.getAllEmployees();

        assertEquals(1650000.0, company.getNetSalaries(), 0.0001);
    }

}
