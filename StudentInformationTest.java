package finalprogramming;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;

import org.junit.jupiter.api.Test;

class StudentInformationTest {

	StudentInformation studentInformation = new StudentInformation();
	
	void numberOfObjectsCorrect() {
		assertEquals(studentInformation.getNumberOfObjects("IDEPT1388"), 89);
	}
	
	void numberOfObjectsIncorrect() {
		assertEquals(studentInformation.getNumberOfObjects("111"), 0);
	}
	
	void numberOfObjectsNull() {
		assertEquals(studentInformation.getNumberOfObjects(null), 0);
	}
	
	void objectsInDepartmentCorrect() {
		StudentInformation studentInformation1 = new StudentInformation();
		assertEquals(studentInformation.getObjectsinDepartment("IDEPT1388"), studentInformation1.getObjectsinDepartment("IDEPT1388"));
	}
	
	void objectsInDepartmentInCorrect() {
		assertTrue(studentInformation.getObjectsinDepartment("IDEPT88").size() == 0);
	}
	
	void objectsInDepartmentNull() {
		assertTrue(studentInformation.getObjectsinDepartment(null).size() == 0);
	}
	
	void dateOfBirthCorrect() {
		assertEquals(studentInformation.dateOfBirth("22-11-1998", "31-12-1999"),studentInformation.dateOfBirth("22-11-1998", "31-12-1999") );
	}
	
	void dateOfBirthInCorrect() {
		assertNull(studentInformation.dateOfBirth("0", "31-12-1999"));
	}
	
	void dateOfBirthOpposite() {
		assertEquals(studentInformation.dateOfBirth("31-12-1999","22-11-1998"), studentInformation.dateOfBirth("31-12-1999","22-11-1998"));
	}
	
	void dateOfAdmissionCorrect() {
		assertEquals(studentInformation.dateOfAdmission("22-11-1998", "31-12-1999"),studentInformation.dateOfBirth("22-11-1998", "31-12-1999") );
	}
	
	void dateOfAdmissionInCorrect() {
		assertNull(studentInformation.dateOfAdmission("0", "31-12-1999"));
	}
	
	void dateOfAdmissionOpposite() {
		assertEquals(studentInformation.dateOfAdmission("31-12-1999","22-11-1998"), studentInformation.dateOfBirth("31-12-1999","22-11-1998"));
	}
	
	@Test
	void test() {
		numberOfObjectsCorrect();
		numberOfObjectsIncorrect();
		numberOfObjectsNull();
		objectsInDepartmentCorrect();
		objectsInDepartmentInCorrect();
		objectsInDepartmentNull();
		dateOfBirthCorrect();
		dateOfBirthInCorrect();
		dateOfBirthOpposite();
		dateOfAdmissionCorrect();
		dateOfAdmissionInCorrect();
		dateOfAdmissionOpposite();
	}

}
