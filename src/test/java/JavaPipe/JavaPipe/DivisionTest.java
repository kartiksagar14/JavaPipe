package JavaPipe.JavaPipe;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivisionTest {

	@Test
	public void test() {
		pipe test = new pipe();
		int result = test.division(12, 4);
		assertEquals(3,result);
	}

}
