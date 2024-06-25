package finalprogramming;

import java.util.ArrayList;

public class StudentPerformanceData extends Object{
	private String paper_ID;
	private String semester_name;
	private String paper_name;
	private int mark;
	
	
	public StudentPerformanceData(ArrayList<String> array) {
		setId(array.get(0));
		this.semester_name = array.get(1);
		this.paper_ID = array.get(2);
		this.paper_name = array.get(3);
		this.mark = Integer.parseInt(array.get(4));
	}
	
	

	public String getPaper_ID() {
		return paper_ID;
	}



	public void setPaper_ID(String paper_ID) {
		this.paper_ID = paper_ID;
	}



	public String getSemester_name() {
		return semester_name;
	}



	public void setSemester_name(String semester_name) {
		this.semester_name = semester_name;
	}



	public String getPaper_name() {
		return paper_name;
	}



	public void setPaper_name(String paper_name) {
		this.paper_name = paper_name;
	}



	public int getMark() {
		return mark;
	}



	public void setMark(int mark) {
		this.mark = mark;
	}



	@Override
	public String toString() {
		return "StudentPerformanceData [ Student ID= "+ super.getId() +", semester_name=" + semester_name + ", paper_ID=" + paper_ID + ", paper_name="
				+ paper_name + ", mark=" + mark + "]";
	}
	
	

}
