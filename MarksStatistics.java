package finalprogramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MarksStatistics extends StudentDataStatistics{

	private ArrayList<Integer> studentMarks = new ArrayList<Integer>();
	
	  private boolean iterate(String student_id) {
	        studentMarks.clear();
	        boolean studentExists = false;
	        
	        for (Iterator iterator = getStdList().getList().iterator(); iterator.hasNext();) {
	            StudentPerformanceData data = (StudentPerformanceData) iterator.next();
	            if (data.getId().equals(student_id)) {
	                studentMarks.add(data.getMark());
	                studentExists = true;
	            }
	        }
	        
	        return studentExists;
	    }

	    public double averageMarks(String student_id) {
	        if (!iterate(student_id)) {
	        	try {
					
				} catch (Exception e) {
					e.getMessage();
				}
	        }

	        double average = (double) sumOfMarks(student_id) / studentMarks.size();
	        return Double.parseDouble(String.format("%.2f", average));
	    }

	    public int sumOfMarks(String student_id) {
	        if (!iterate(student_id)) {
	            throw new IllegalArgumentException("Student with ID " + student_id + " does not exist.");
	        }

	        int sum = 0;
	        for (Integer mark : studentMarks) {
	            sum += mark;
	        }

	        return sum;
	    }

	    public int maxMark(String student_id) {
	        if (!iterate(student_id)) {
	            throw new IllegalArgumentException("Student with ID " + student_id + " does not exist.");
	        }

	        return Collections.max(studentMarks);
	    }

	    public int minMark(String student_id) {
	        if (!iterate(student_id)) {
	            throw new IllegalArgumentException("Student with ID " + student_id + " does not exist.");
	        }

	        return Collections.min(studentMarks);
	    }
	}
