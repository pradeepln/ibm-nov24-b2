package com.ibm.training.enums.with;

public class StudentApp {

	public static void main(String[] args) {
		
		Student s = new Student();
		
		s.setName("pradeep");
		s.setId(60);
		//s.setGrade(StudentGrade.GRADE_A);
		//s.setGrade('-');
		
		s.setGrade(StudentGrade.GRADE_A);
		
		//s.setGrade(new StudentGrade());
		
		StudentGrade g = s.getGrade();
		
		int prizeMoney = 0;
		
		if(g == StudentGrade.GRADE_A) {
			
			prizeMoney = 10_000;
		}else if(g == StudentGrade.GRADE_B) {
			prizeMoney = 5000;
		}
		
		switch(g) {
		case GRADE_A:
			prizeMoney = 10_000;
			break;
		case GRADE_B:
			prizeMoney = 5_000;
			break;
		}
		
		
		StudentGrade[] allGrades = StudentGrade.values();
		
		System.out.println(g);
	}

}
