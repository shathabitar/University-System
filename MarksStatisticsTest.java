package finalprogramming;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarksStatisticsTest {

	MarksStatistics marksStatistics = new MarksStatistics();
	
	void averageMarksCorrect() {
		assertEquals(marksStatistics.averageMarks("SID20189989"), 70.96);
	}
	
	void averageMarksIncorrect() {
		assertThrows(IllegalArgumentException.class, () -> marksStatistics.averageMarks("111"));
    }
	
	void averageMarksNull() {
		assertThrows(IllegalArgumentException.class, () -> marksStatistics.averageMarks(null));
  
    }
	
	void sumMarksCorrect() {
		assertEquals(marksStatistics.sumOfMarks("SID20189989"), 3903);
	}
	
	void sumMarksIncorrect() {
		assertThrows(IllegalArgumentException.class, () -> marksStatistics.sumOfMarks("111"));
      
    }
	
	void sumMarksNull() {
		assertThrows(IllegalArgumentException.class, () -> marksStatistics.sumOfMarks(null));
      
    }
	
	void maxMarksCorrect() {
		assertEquals(marksStatistics.maxMark("SID20189989"), 99);
	}
	
	void maxMarksIncorrect() {
		assertThrows(IllegalArgumentException.class, () -> marksStatistics.maxMark("111"));
    }
	
	void maxMarksNull() {
		assertThrows(IllegalArgumentException.class, () -> marksStatistics.maxMark(null));
      
    }
	
	void minMarksCorrect() {
		assertEquals(marksStatistics.minMark("SID20189989"), 41);
	}
	
	void minMarksIncorrect() {
		assertThrows(IllegalArgumentException.class, () -> marksStatistics.minMark("111"));
      
    }	
	void minMarksNull() {
		assertThrows(IllegalArgumentException.class, () -> marksStatistics.minMark(null));
      
    }
	
	@Test
	void test() {
		averageMarksCorrect();
		averageMarksIncorrect();
		averageMarksNull();
		sumMarksIncorrect();
		sumMarksCorrect();
		sumMarksNull();
		maxMarksCorrect();
		maxMarksIncorrect();
		maxMarksNull();
		minMarksCorrect();
		minMarksIncorrect();
		minMarksNull();
	}

}
