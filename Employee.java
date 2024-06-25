package finalprogramming;


import java.util.ArrayList;


public class Employee extends Person {

	
	public Employee(ArrayList<String> array) {
		super(array);
		
	}


	@Override
	public String toString() {
		return "Employee [ id= " + getId() +" date_of_birth=" + getDate_of_birth() + ", date_of_joining=" + getDate_of_admission() + ", dept_id="
				+ getDept_id() + "]";
	}
	
	
	
}
