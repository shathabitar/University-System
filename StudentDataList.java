package finalprogramming;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentDataList extends ListOfObjects{
	
	private ArrayList<Object> list = new ArrayList<Object>();
	
	public StudentDataList() {
		fillObject();
	}

	public void fillObject() {
		fillList("/Users/shath/eclipse-workspace/finalprogramming/src/finalprogramming/data set/Student_Performance_Data.txt");
		
		for (ArrayList<String> array : readFile.getArray()) {
	        StudentPerformanceData data= new StudentPerformanceData(array);
	        list.add(data);
	    }
		
	}
	
	public Object getObjectById(String id) {
		 for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			 StudentPerformanceData data = (StudentPerformanceData) iterator.next();
			if (data.getPaper_ID().equals(id)) {
				return data;
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
