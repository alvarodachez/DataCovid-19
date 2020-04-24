package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Operations.Helper;

class HelperTest {

	@Test
	void testPrintVersion() {
		assertEquals("Version 1.0",Helper.printVersion());
	}

	@Test
	void testSumOperation() {
		assertEquals(2,Helper.sumOperation(1, 1));
	}

}
