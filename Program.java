package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.print("Name: ");
		student.name = sc.nextLine();
		System.out.print("First grade: ");
		student.grade1 = sc.nextDouble();
		System.out.print("Second grade: ");
		student.grade2 = sc.nextDouble();
		System.out.print("Third grade: ");
		student.grade3 = sc.nextDouble();
		
		System.out.println();
		if (!student.passOrNot()) {
			System.out.println("Final Grade = " + student.finalGrade());
			System.out.println("FAILED");
			System.out.println("Missing " + student.missingPoints() + " points");
		}
		else {
			System.out.println("Final Grade = " + student.finalGrade());
			System.out.println("PASS");
		}
		
		sc.close();
	}

}
