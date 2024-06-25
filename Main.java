package finalprogramming;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String type;
		do {
			System.out.print("Students or Employees? ");
			type = scanner.nextLine();
		} while (!(type.toLowerCase().equals("students") || type.toLowerCase().equals("employees")));
		
		
		Application application = new Application(type);
	}

}
