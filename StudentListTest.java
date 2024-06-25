package finalprogramming;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentListTest {
	StudentList studentList = new StudentList();
	

	void studentListTestCorrect() {
		StudentList studentList1 = new StudentList();
		assertTrue(studentList.getObjectById("SID20131143").equals(studentList1.getObjectById("SID20131143")));
	}
		
	void studentListTestIncorrect() {
		assertNull(studentList.getObjectById("student"));
	}

	void studentListTestNull() {
		assertNull(studentList.getObjectById(null));
	}
	
	@org.junit.jupiter.api.Test
	void test() {
		studentListTestIncorrect();
		studentListTestNull();
	}

}
