package finalprogramming;

import java.util.Hashtable;
import java.util.Iterator;

public class NumberOfSemesters extends StudentDataStatistics{

	public int getNumberOfSemesters(String student_ID){
		Hashtable<String,Integer> semesters = new Hashtable<String,Integer>();
		//hashtable to store each semester once
		
		for (Iterator iterator = getStdList().getList().iterator(); iterator.hasNext();) {
			 StudentPerformanceData data = (StudentPerformanceData) iterator.next();
			 //traverse over StudentDataList
			if (data.getId().equals(student_ID)) {
				semesters.put(data.getSemester_name(),0);
				//add semester to hashtable if the student id matches the one provided
			}
			
		}
		
		return semesters.size();
		// returns the number of semesters stored in hashtable
		
	}
}
