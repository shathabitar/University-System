package finalprogramming;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeInformationTest {

	EmployeeInformation employeeInformation = new EmployeeInformation();
	
	void numberOfObjectsCorrect() {
		assertEquals(employeeInformation.getNumberOfObjects("IDEPT1388"), 32);
	}
	
	void numberOfObjectsIncorrect() {
		assertEquals(employeeInformation.getNumberOfObjects("111"), 0);
	}
	
	void numberOfObjectsNull() {
		assertEquals(employeeInformation.getNumberOfObjects(null), 0);
	}
	
	void objectsInDepartmentCorrect() {
		EmployeeInformation employeeInformation1 = new EmployeeInformation();
		assertEquals(employeeInformation.getObjectsinDepartment("IDEPT1388"), employeeInformation1.getObjectsinDepartment("IDEPT1388"));
	}
	
	void objectsInDepartmentInCorrect() {
		assertTrue(employeeInformation.getObjectsinDepartment("IDEPT88").size() == 0);
	}
	
	void objectsInDepartmentNull() {
		assertTrue(employeeInformation.getObjectsinDepartment(null).size() == 0);
	}
	
	@Test
	void test() {
		numberOfObjectsCorrect();
		numberOfObjectsIncorrect();
		numberOfObjectsNull();
		objectsInDepartmentCorrect();
		objectsInDepartmentInCorrect();
		objectsInDepartmentNull();
	}

}
