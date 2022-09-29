import static org.junit.Assert.*;

import org.junit.Test;

public class TestRegistrar {

	@Test
	public void testCanRegister_1() {
		Registrar R = new Registrar();
		boolean actual = R.canRegister(16, 2.99);
		boolean expected = false; 
		
		assertEquals(expected,actual);
	}
	
	@Test
	public void testCanRegister_2() {	
		Registrar R = new Registrar();
		boolean actual = R.canRegister(16, 3.00);
		boolean expected = true; 
		
		assertEquals(expected,actual);
	}
	
	@Test
	public void testCanRegister_3() {	
		Registrar R = new Registrar();
		R.setOverride(false);
		boolean actual = R.canRegister(1, 1.99);
		boolean expected = false; 
		
		assertEquals(expected,actual);
	}
	
	@Test
	public void testCanRegister_4() {	
		Registrar R = new Registrar();
		R.setOverride(true);
		boolean actual = R.canRegister(1, 1.99);
		boolean expected = true; 
		
		assertEquals(expected,actual);
	}
	
	@Test
	public void testCanRegister_5() {	
		Registrar R = new Registrar();
		boolean actual = R.canRegister(20, 3.50);
		boolean expected = true; 
		
		assertEquals(expected,actual);
	}
	
	@Test
	public void testCanRegister_6() {	
		Registrar R = new Registrar();
		R.setOverride(true);
		boolean actual = R.canRegister(20, 1.50);
		boolean expected = false; 
		
		assertEquals(expected,actual);
	}
	
	@Test
	public void testCanRegister_7() {	
		Registrar R = new Registrar();
		R.setOverride(true);
		boolean actual = R.canRegister(1, 2.50);
		boolean expected = true; 
		
		assertEquals(expected,actual);
	}
	
	@Test
	public void testCanRegister_8() {	
		Registrar R = new Registrar();
		R.setOverride(true);
		boolean actual = R.canRegister(18, 2.50);
		boolean expected = false; 
		
		assertEquals(expected,actual);
	}

}
