package finalprogramming;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentDataListTest {

	StudentDataList studentDataList = new StudentDataList();
	

	void studentDataListTestCorrect() {
		StudentDataList studentDataList1 = new StudentDataList();
		assertTrue(studentDataList.getObjectById("SEMI0067259").equals(studentDataList1.getObjectById("SEMI0067259")));
	}
		
	void studentDataListTestIncorrect() {
		assertNull(studentDataList.getObjectById("data"));
	}

	void studentDataListTestNull() {
		assertNull(studentDataList.getObjectById(null));
	}
	
	@org.junit.jupiter.api.Test
	void test() {
		studentDataListTestCorrect();
		studentDataListTestIncorrect();
		studentDataListTestNull();
	}

}
