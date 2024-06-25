package finalprogramming;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Department extends Object{

	

	private String dept_name;
	private SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	private Date dept_establishment_date;
	
	public Department(ArrayList<String> array) {
		setId(array.get(0));
		this.dept_name = array.get(1);
		 try {
			 this.dept_establishment_date = (Date) dateFormat.parse(array.get(2));
		    } catch (ParseException e) {
		        System.out.println("Failed to parse due date: " + e.getMessage());
		        e.printStackTrace();
		    }
	}
	
	public String getDept_name() {
		return dept_name;
	}



	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}



	public Date getDept_establishment_date() {
		return dept_establishment_date;
	}



	public void setDept_establishment_date(Date dept_establishment_date) {
		this.dept_establishment_date = dept_establishment_date;
	}

	@Override
	public String toString() {
		return "Department [id=" + getId() + ", dept_name=" + dept_name + ", dept_establishment_date=" + dept_establishment_date + "]";
	}


}
