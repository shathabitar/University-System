package finalprogramming;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeInformation implements Information {
	private EmployeeList empList = new EmployeeList();
	private ArrayList<Object> employees = new ArrayList<Object>();
	
	@Override
	public ArrayList<Object> getObjectsinDepartment(String dept_id) {
		
		employees.clear();
		
		for (Iterator iterator = empList.getList().iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			if (employee.getDept_id().equals(dept_id)) {
				employees.add(employee);
			}
		}
		
		return employees;
		
	}


	@Override
	public int getNumberOfObjects(String dept_id) {
		int counter = 0;
		
		for (Iterator iterator = empList.getList().iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			if (employee.getDept_id().equals(dept_id)) {
				counter++;
			}
		}
		
		return counter;
	}
	
}
