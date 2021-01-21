package tallerpruebas;

import org.junit.Test;
import junit.framework.TestCase;

public class Casos extends TestCase{

    @Test
	public void test(){
		//Moneda USD, es supervisor, mes par
		Employee instance=new Employee(400,"USD",10, EmployeeType.Supervisor);
		float expected=403.5f;
		assertEquals(expected , instance.cs() ,0);
	}

	@Test	
	public void Test(){
		//Moneda USD, es supervisor, mes impar
		Employee instance=new Employee(400,"USD", 10, EmployeeType.Supervisor);
		float expected=467.83334f;
		assertEquals(expected , instance.cs() ,0);
	}
	
	@Test
	public void testCs_noUsdSupervisor() {
		//Moneda no es USD, es supervisor- cs
		Employee em = new Employee(400, "MXN",5, EmployeeType.Supervisor);
		float resultadoEsperado = 446.0f;
		assertEquals(resultadoEsperado,em.cs(),0.1);
	}
	@Test
	public void testCalculateYearBonus_noUsdSupervisor() {
		//Moneda no es USD, es supervisor- CalculateYearBonus
		Employee em = new Employee(400, "MXN",5, EmployeeType.Supervisor);
		float resultadoEsperado = 573.0f;
		assertEquals(resultadoEsperado,em.CalculateYearBonus(),0.1);
	}
	

}
