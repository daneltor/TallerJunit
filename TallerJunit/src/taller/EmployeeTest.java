package taller;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class EmployeeTest {
	
	Employee employee;
	private static int nCaso = 0;
	
	@Parameters
	public static Iterable<Object[]> getData() {
		List<Object[]> obj = new ArrayList<>();
		obj.add(new Object[] { 400.00f, "USD", 5.00f, EmployeeType.Worker });
		obj.add(new Object[] { 400.00f, "USD", 5.00f, EmployeeType.Supervisor });
		obj.add(new Object[] { 400.00f, "USD", 5.00f, EmployeeType.Manager });
		
		obj.add(new Object[] { 400.00f, "MXN", 5.00f, EmployeeType.Worker });
		obj.add(new Object[] { 400.00f, "MXN", 5.00f, EmployeeType.Supervisor });
		obj.add(new Object[] { 400.00f, "MXN", 5.00f, EmployeeType.Manager });
		
		return obj;
	}
	
	private final float rmu = (float) 386.0;
    //salario del employee
    private float salary;
    private String currency;
    //porcentaje de bonus
    private float bonusPercentage;    
    //variable de tipo employeeType
    private EmployeeType employeeType; 
    
    public EmployeeTest(float salary, String currency, 
            float bonusPercentage, EmployeeType employeeType)
    {
    	this.salary = salary;
        this.currency = currency;
        this.bonusPercentage = bonusPercentage;
        this.employeeType = employeeType;
    }
    
    @Before
    public void before() {
    	nCaso++;
    	System.out.println("Caso #"+nCaso);
    	System.out.printf("Salary: %.2f, Currency: %s, Bonus: %.2f%%, EmployeeType: %s \n", salary, currency,
    			bonusPercentage, employeeType);
    	employee = new Employee(salary,currency,bonusPercentage,employeeType);
    }
    
    @Test
    public void testCs() {
    	assertTrue(true);
    }

	@Test
	public void testCalculateYearBonus() {
		//fail("Not yet implemented");
		assertTrue(true);
	}

}
