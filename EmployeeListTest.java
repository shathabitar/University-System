package finalprogramming;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeListTest {

	EmployeeList employeeList = new EmployeeList();
	

	void employeeListTestCorrect() {
		EmployeeList employeeList1 = new EmployeeList();
		assertTrue(employeeList.getObjectById("IU423522").equals(employeeList1.getObjectById("IU423522")));
	}
		
	void employeeListTestIncorrect() {
		assertNull(employeeList.getObjectById("employee"));
	}

	void employeeListTestNull() {
		assertNull(employeeList.getObjectById(null));
	}
	
	@org.junit.jupiter.api.Test
	void test() {
		//employeeListTestCorrect();
		employeeListTestIncorrect();
		employeeListTestNull();
	}

}
