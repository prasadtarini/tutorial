package unitproject1;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class unittesting {
	methods m= new methods();
	
	@BeforeClass
	public static void display() {
		System.out.println("starting the test..");
	}
	
	@AfterClass 
	public static void disp() {
		System.out.println("completed the test....");
	}
	

	@Test
	public void test() {
		int a= 2;
		int b= m.multiply(4);
		assertEquals(8,b);
		
	}

}
