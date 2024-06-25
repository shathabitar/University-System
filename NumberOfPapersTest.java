package finalprogramming;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumberOfPapersTest {

	NumberOfPapers numberOfPapers = new NumberOfPapers();
	
	void numberOfPapersCorrect() {
		assertEquals(numberOfPapers.getNumberOfPapers("SID20131143"), 55);
	}
	
	void numberOfPapersInCorrect() {
		assertEquals(numberOfPapers.getNumberOfPapers("111"), 0);
	}
	
	void numberOfPapersNull() {
		assertEquals(numberOfPapers.getNumberOfPapers(null), 0);
	}

	@Test
	void test() {
	
		numberOfPapersCorrect();
		numberOfPapersInCorrect();
		numberOfPapersNull();
	}


}
