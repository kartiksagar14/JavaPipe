package JavaPipe.JavaPipe;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConcateTest {

	@Test
	public void testConcatenate() {
		pipe test = new pipe();
		String result = test.concatenate("one", "two");
		assertEquals("onetwo",result);
	}

 }
