package finalprogramming;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumberOfSemestersTest {
	
	NumberOfSemesters numberOfSemesters = new NumberOfSemesters();
	
	void numberOfSemestersCorrect() {
		assertEquals(numberOfSemesters.getNumberOfSemesters("SID20131143"), 8);
	}
	
	void numberOfSemestersInCorrect() {
		assertEquals(numberOfSemesters.getNumberOfSemesters("SID203"), 0);
	}
	
	void numberOfSemestersNull() {
		assertEquals(numberOfSemesters.getNumberOfSemesters(null), 0);
	}

	@Test
	void test() {
		numberOfSemestersCorrect();
		numberOfSemestersInCorrect();
		numberOfSemestersNull();
	}

}
