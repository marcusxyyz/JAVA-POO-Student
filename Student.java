package entities;

public class Student {
	
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}
	
	public boolean passOrNot() {
		if (finalGrade() >= 60.00) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public double missingPoints() {
		if (!passOrNot()) {
			return 60.00 - finalGrade();
		}
		else {
			return finalGrade();
		}
	}

}
