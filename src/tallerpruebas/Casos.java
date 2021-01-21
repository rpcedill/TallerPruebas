package tallerpruebas;

import static org.junit.Assert.*;

import org.junit.Test;

public class Casos {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

        @Test
	public void Test(){
		//mes par
		Employee instance=new Employee(400,"USD",10, EmployeeType.Supervisor);
		float expected=403.5f;
		assertEquals(expected , instance.cs() ,0);
	}

}
