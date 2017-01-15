import static org.junit.Assert.*;

import org.junit.Test;

public class PrimaTest {

	
	@Test
	public void test() {
		Prima prima1= new Prima(14, "J", "J");
		Prima prima2= new Prima(25, "M", "J");
		Prima prima3= new Prima(19, "M", "S");
		Prima prima4= new Prima(45, "M", "C");
		Prima prima5= new Prima(27, "M", "S");
		Prima prima6= new Prima(66, "F", "C");
		Prima prima7= new Prima(25, "J", "J");
		Prima prima8= new Prima(81, "M", "S");
		
		assertEquals(-1, prima1.getPrima());
		assertEquals(-1, prima2.getPrima());
		assertEquals(2000, prima3.getPrima());
		assertEquals(200, prima4.getPrima());
		assertEquals(500, prima5.getPrima());
		assertEquals(300, prima6.getPrima());
		assertEquals(-1, prima7.getPrima());
		assertEquals(-1, prima8.getPrima());
	}

	
}
