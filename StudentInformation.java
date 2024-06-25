package finalprogramming;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Objects;

public class StudentInformation implements Information, ObjectsInRange{

	private StudentList stdList = new StudentList();
	private ArrayList<Object> students = new ArrayList<Object>();
	private SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	
	@Override
	public ArrayList<Object> getObjectsinDepartment(String dept_id) {
		
		students.clear();
		for (Iterator iterator = stdList.getList().iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();	
			if (student.getDept_id().equals(dept_id)) {
				students.add(student);
			}
		}
		
		return students;
		
	}


	@Override
	public int getNumberOfObjects(String dept_id) {
		int counter = 0;
		
		for (Iterator iterator = stdList.getList().iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			if (student.getDept_id().equals(dept_id)) {
				counter++;
			}
		}
		
		return counter;
		
	}

	@Override
	public ArrayList<Object> dateOfBirth(String start, String end) {

        Date start_date = null;
        Date end_date = null;
        try {
        	start_date = (Date) dateFormat.parse(start);
			end_date = (Date) dateFormat.parse(end);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }

        ArrayList<Object> students = new ArrayList<Object>();
        for (Iterator iterator = stdList.getList().iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			Date dob = student.getDate_of_birth();
			if (!dob.before(start_date) && dob.before(end_date)) {
				students.add(student);
			}
		}

        return students;
    }

	@Override
	public ArrayList<Object> dateOfAdmission(String start, String end) {
		
		Date start_date = null;
		Date end_date = null;
		try {
			start_date = (Date) dateFormat.parse(start);
			end_date = (Date) dateFormat.parse(end);
		} catch (ParseException e) {
		    return null;
		}
		
		ArrayList<Object> students = new ArrayList<Object>();
		for (Iterator iterator = stdList.getList().iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			Date doa = student.getDate_of_admission();
			if (!doa.before(start_date) && doa.before(end_date)) {
				students.add(student);
			}
		}
		return students;

	}
	
}
