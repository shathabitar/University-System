package finalprogramming;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DepartmentListTest {

	DepartmentList departmentList = new DepartmentList();
	
	void departmentListTestCorrect() {	
		DepartmentList departmentList2 = new DepartmentList();	
		assertTrue(departmentList.getObjectById("IDEPT2601").equals(departmentList2.getObjectById("IDEPT2601")));
	}
		
	void departmentListTestIncorrect() {
		assertNull(departmentList.getObjectById("department1"));
	}

	void departmentListTestNull() {
		assertNull(departmentList.getObjectById(null));
	}
	
	@org.junit.jupiter.api.Test
	void test() {
		departmentListTestCorrect();
		departmentListTestIncorrect();
		departmentListTestNull();
	}
}
