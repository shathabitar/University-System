package finalprogramming;

import java.util.ArrayList;
import java.util.Iterator;

public class DepartmentList extends ListOfObjects{
	
	private ArrayList<Object> list = new ArrayList<Object>();
	
	public DepartmentList() {
		fillObject();
	}
	
	public void fillObject() {
		fillList("/Users/shath/eclipse-workspace/finalprogramming/src/finalprogramming/data set/Department_Information.txt");
		
		for (ArrayList<String> array : readFile.getArray()) {
	        Department department= new Department(array);
	        list.add(department);
	    }
		
	}
	
	 public Object getObjectById(String id) {
		 for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Department department = (Department) iterator.next();
			if (department.getId().equals(id)) {
				return department;
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
