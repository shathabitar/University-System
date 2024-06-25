package finalprogramming;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Person extends Object{
	private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	private Date date_of_birth;
	private Date date_of_admission;
	private String dept_id;
	
	public Person(ArrayList<String> array) {
		setId(array.get(0));
		this.dept_id = array.get(3);
		
		try {
			this.date_of_birth = (Date) dateFormat.parse(array.get(2));
			this.date_of_admission = (Date) dateFormat.parse(array.get(1));
		    } catch (ParseException e) {
		        System.out.println("Failed to parse due date: " + e.getMessage());
		        e.printStackTrace();
		    }
	}

	public Date getDate_of_birth() {
		return date_of_birth;
	}



	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}



	public Date getDate_of_admission() {
		return date_of_admission;
	}

	public void setDate_of_admission(Date date_of_admission) {
		this.date_of_admission = date_of_admission;
	}

	public String getDept_id() {
		return dept_id;
	}

	public void setDept_id(String dept_id) {
		this.dept_id = dept_id;
	}


}
