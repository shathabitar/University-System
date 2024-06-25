package finalprogramming;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentList extends ListOfObjects{
	
	private ArrayList<Student> list = new ArrayList<Student>();

	public StudentList() {
		fillObject();
	}
	
	public void fillObject() {
		fillList("/Users/shath/eclipse-workspace/finalprogramming/src/finalprogramming/data set/Student_Counceling_Information.txt");
		
		for (ArrayList<String> array : readFile.getArray()) {
	        Student student= new Student(array);
	        list.add(student);
	    }
		
	}
	
	public Object getObjectById(String id) {
		 for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			 Student student = (Student) iterator.next();
			if (student.getId().equals(id)) {
				return student;
			}
			
		}
		 
		 return null;
	 }

	public ArrayList<Student> getList() {
		return list;
	}

	public void setList(ArrayList<Student> list) {
		this.list = list;
	}
	
	
	
}
