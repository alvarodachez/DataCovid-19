package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Model.Data;

class DataTest {

//	@Test
//	void testData() {
//		fail("Not yet implemented");
//	}

//	@Test
//	void testGetName() {
//		fail("Not yet implemented");
//	}

//	@Test
//	void testGetAverage() {
//		fail("Not yet implemented");
//	}

//	@Test
//	void testGetDataList() {
//		
//	}

	@Test
	void testSetAverage() {
		Data test = new Data("test");
		test.addValue("1", 1);
		test.addValue("2", 2);
		test.setAverage();
		assertEquals(1, test.getAverage());
		
	}

	@Test
	void testAddValue() {
		Data test = new Data("test");
		test.addValue("1", 1);
		assertEquals("Name: test Average: 1"+"\n" + 
				"Date: 1Value: 1"+"\n", test.toString());
	}

//	@Test
//	void testToString() {
//		fail("Not yet implemented");
//	}

}
