package finalprogramming;

import java.util.ArrayList;

public class Student extends Person{

	private String dept_choice_id;
	
	public Student(ArrayList<String> array) {
		super(array);
		this.dept_choice_id = array.get(4);
		
	}


	public String getDept_choice_id() {
		return dept_choice_id;
	}

	public void setDept_choice_id(String dept_choice_id) {
		this.dept_choice_id = dept_choice_id;
	}

	@Override
	public String toString() {
		return "Student [ id= " + getId() + ", date_of_birth= " + getDate_of_birth() + ", date_of_admission= " + getDate_of_admission() + ", dept_id= "
				+ getDept_id() + ", dept_choice= " + dept_choice_id + "]";
	}

	
	
}
