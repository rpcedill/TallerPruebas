package tallerpruebas;

import org.junit.Test;
import junit.framework.TestCase;

public class Casos extends TestCase{

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

	//Moneda es USD y es supervisor -cs()
	@Test
	public void testUSDSupervisor1(){
		Employee instance=new Employee(365,"USD",15, EmployeeType.Supervisor);
		float expected=434.5833f;
		assertEquals(expected , instance.cs() ,0.1);
		}
	
	//Moneda es USD y es supervisor -calculateYearBonus()
	@Test
	public void testUSDSupervisor2(){
		Employee instance=new Employee(365,"USD",15, EmployeeType.Supervisor);
		float expected=558f;
		assertEquals(expected , instance.CalculateYearBonus() ,0.1);
		}
	
	//Moneda es USD y es manager -cs()
        @Test
        public void testUSDManager1(){
            Employee instance=new Employee(300,"USD",10, EmployeeType.Manager);
            float expected=371.3333f;
            assertEquals(expected , instance.cs() ,0.1);
            }

    	//Moneda es USD y es manager -calculateYearBonus()
        @Test
        public void testUSDManager2(){
            Employee instance=new Employee(300,"USD",10, EmployeeType.Manager);
            float expected=686f;
            assertEquals(expected , instance.CalculateYearBonus() ,0.1);
            }


	//Moneda no es USD y es worker -cs()
        @Test
        public void testnoUSDWorker1(){
            Employee instance=new Employee(200,"MXN",6, EmployeeType.Worker);
            float expected=254.3333f;
            assertEquals(expected , instance.cs() ,0.1);
            }

    	//Moneda no es USD y es worker -calculateYearBonus()
        @Test
        public void testnoUSDWorker2(){
            Employee instance=new Employee(200,"MXN",6, EmployeeType.Worker);
            float expected=386f;
            assertEquals(expected , instance.CalculateYearBonus() ,0.1);
            }
        
        // Moneda no es USD y es Manager - cs()
        public void testCsNoUSDManager() {
        	Employee instance =new Employee(350,"MXN",15, EmployeeType.Manager);
        	float expected = 407.33334f;
        	assertEquals(expected , instance.cs() ,0.1);
        }
     // Moneda no es USD y es Manager - calculateYearBonus()
        public void testCalculateYearBonusNoUSDManager() {
        	Employee instance =new Employee(350,"MXN",15, EmployeeType.Manager);
        	float expected = 718.5f;
        	assertEquals(expected , instance.cs() ,0.1);
        }
	
	//Moneda USD, es supervisor, mes par
	@Test
	public void Test(){
		Employee instance=new Employee(400,"USD",10,EmployeeType.Supervisor);
		float expected=403.5f;
		assertEquals(expected, intance.cs() , 0.1);
	}
    
        

}
