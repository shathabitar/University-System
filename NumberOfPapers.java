package finalprogramming;

import java.util.Iterator;

public class NumberOfPapers extends StudentDataStatistics {

	public int getNumberOfPapers(String student_ID){
		int counter = 0;
		//initialize counter to count number of papers 
		for (Iterator iterator = getStdList().getList().iterator(); iterator.hasNext();) {
			 StudentPerformanceData data = (StudentPerformanceData) iterator.next();
			//traverse over StudentDataList
			if (data.getId().equals(student_ID)) {
				counter ++;
				//increase counter if the student id matches the one provided
			}
			
		}
		return counter;
		//returns the number of papers
	}
}
