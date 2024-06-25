package finalprogramming;
import java.util.Scanner;

public class Application {
		
		private Scanner scanner = new Scanner(System.in);
		
		public Application(String type) {
			if (type.toLowerCase().equals("students")) {
				studentAffairs();
			}
			else if(type.toLowerCase().equals("employees")) {
				HRsystem();
			}
		}

		
		public void HRsystem() {
			EmployeeList employeeList = new EmployeeList();
			EmployeeInformation employeeInformation = new EmployeeInformation();
			DepartmentList departmentList = new DepartmentList();
			int key = 0;
			
			do {
				System.out.println(" 1 to get employee by ID \n 2 to view all employees in a department \n 3 to get number of employees in a department \n 4 to get department by ID"
						+ "\n 5 to Exit");
			
			
				do {
		            System.out.print("Enter Number(1-5):");
		            String keyString = scanner.next();
		            try {
		                key = Integer.parseInt(keyString);
		            } catch (NumberFormatException e) {
		                System.out.println("Invalid input. Please enter a number between 1 and 5.");
		                key = 0; 
		            }
		        } while (!(key == 1 || key == 2 || key == 3 || key == 4 || key == 5));
				
				
				switch (key) {
				case 1: {
					System.out.print("Enter employee ID:");
					String id = scanner.next();
					System.out.println();
					System.out.println(employeeList.getObjectById(id));
					System.out.println();
					break;
				}
				case 2: {
					System.out.print("Enter department ID:");
					String dept_id = scanner.next();
					System.out.println();
					for (Object employee : employeeInformation.getObjectsinDepartment(dept_id)) {
						System.out.println(employee);
					}
					System.out.println();
					break;
				}
				case 3: {
					System.out.print("Enter department ID:");
					String dept_id = scanner.next();
					System.out.println();
					System.out.print("Number of Employees in " + dept_id + " is: ");
					System.out.println(employeeInformation.getNumberOfObjects(dept_id));
					System.out.println();
					break;
				}
				case 4:{
					System.out.print("Enter department ID:");
					String id = scanner.next();
					System.out.println();
					System.out.println(departmentList.getObjectById(id));
					System.out.println();
					break;
				}
				case 5: {
					return;
				}
				default:
				
				}
			} while (key != 5);
		}
		
		public void studentAffairs(){
			
			StudentList studentList = new StudentList();
			StudentDataList studentDataList = new StudentDataList();
			StudentInformation studentInformation = new StudentInformation();
			MarksStatistics marksStatistics = new MarksStatistics();
			NumberOfPapers numberOfPapers = new NumberOfPapers();
			NumberOfSemesters numberOfSemesters = new NumberOfSemesters();
			
			int key = 0;
			
			do {
				System.out.println(" 1 to get student by ID \n 2 to get paper by ID \n 3 to view all students in a department \n 4 to get number of students in a department"
						+ "\n 5 to get all stduents in a range of birth dates \n 6 to get all students in a range of admission dates \n 7 to get student marks statistics" +
						"\n 8 to get number of papers for a student \n 9 to get number of semesters for a student \n 10 to exit");
			
				do {
		            System.out.print("Enter Number(1-10):");
		            String keyString = scanner.next();
		            try {
		                key = Integer.parseInt(keyString);
		            } catch (NumberFormatException e) {
		                System.out.println("Invalid input. Please enter a number between 1 and 10.");
		                key = 0; 
		            }
		        } while (!(key == 1 || key == 2 || key == 3 || key == 4 || key == 5 || key == 6 || key == 7 || key == 8 || key == 9 || key == 10));
				
				
				switch (key) {
				case 1: {
					System.out.print("Enter student ID:");
					String id = scanner.next();
					System.out.println();
					System.out.println(studentList.getObjectById(id));
					System.out.println();
					break;
				}
				case 2: {
					System.out.print("Enter paper ID:");
					String id = scanner.next();
					System.out.println();
					System.out.println(studentDataList.getObjectById(id));
					System.out.println();
					break;
				}
				case 3: {
					System.out.print("Enter department ID:");
					String dept_id = scanner.next();
					System.out.println();
					for (Object employee : studentInformation.getObjectsinDepartment(dept_id)) {
						System.out.println(employee);
					}
					System.out.println();
					break;
				}
				case 4: {
					System.out.print("Enter department ID:");
					String dept_id = scanner.next();
					System.out.println();
					System.out.print("Number of Students in " + dept_id + " is: ");
					System.out.println(studentInformation.getNumberOfObjects(dept_id));
					System.out.println();
					break;
				}
				case 5: {
					System.out.print("Enter start date:");
					String start = scanner.next();
					System.out.print("Enter end date:");
					String end = scanner.next();
					System.out.println();
					System.out.print("Students in range " + start + " to " + end);
					for (Object employee : studentInformation.dateOfBirth(start, end)) {
						System.out.println(employee);
					}
					System.out.println();
					break;
				}
				case 6: {
					System.out.print("Enter start date:");
					String start = scanner.next();
					System.out.print("Enter end date:");
					String end = scanner.next();
					System.out.println();
					System.out.print("Students in range " + start + " to " + end);
					for (Object employee : studentInformation.dateOfAdmission(start, end)) {
						System.out.println(employee);
					}
					System.out.println();
					break;
				}
				case 7: {
					System.out.print("Enter student ID:");
					String id = scanner.next();
					System.out.println();
					System.out.println("Maximum mark: " + marksStatistics.maxMark(id));
					System.out.println("Minimum mark: " + marksStatistics.minMark(id));
					System.out.println("Average of marks : " + marksStatistics.averageMarks(id));
					System.out.println("Sum of marks: " + marksStatistics.sumOfMarks(id));
					System.out.println();
					break;
				}
				case 8: {
					System.out.print("Enter student ID:");
					String id = scanner.next();
					System.out.println();
					System.out.println("Number of papers for student " + id + " is: " + numberOfPapers.getNumberOfPapers(id));
					System.out.println();
					break;
				}
				case 9: {
					System.out.print("Enter student ID:");
					String id = scanner.next();
					System.out.println();
					System.out.println("Number of semesters for student " + id + " is: " + numberOfSemesters.getNumberOfSemesters(id));
					System.out.println();
					break;
				}
				case 10: {
					return;
				}
				default:
				
				}
			} while (key != 10);
		}

}
