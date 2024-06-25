package finalprogramming;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeList extends ListOfObjects {
	
	private ArrayList<Object> list = new ArrayList<Object>();
	
	public EmployeeList() {
		fillObject();
	}

	public void fillObject() {
		fillList("/Users/shath/eclipse-workspace/finalprogramming/src/finalprogramming/data set/Employee_Information.txt");
		
		for (ArrayList<String> array : readFile.getArray()) {
	        Employee employee= new Employee(array);
	        list.add(employee);
	    }
		
	}
	
	public Object getObjectById(String id) {
		 for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			if (employee.getId().equals(id)) {
				return employee;
			}
			 
		}
		 
		 return null;
	 }

	public ArrayList<Object> getList() {
		return list;
	}

	public void setList(ArrayList<Object> list) {
		this.list = list;
	}
	
	
}
