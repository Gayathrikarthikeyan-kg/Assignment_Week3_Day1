package org.system;

public class Student  extends Department{
	
	public void	studentName() {
		System.out.println(" Bala");
	}
	public void studentDept() {
		System.out.println("Information and Techonlogy");
	}
	public void studentId()
	{
		System.out.println(719);
	}

	public static void main(String[] args) {
		Student ss= new Student();
		ss.studentId();
		ss.studentName();
		ss.studentDept();
		ss.collegeCode();
		ss.collegeName();
		ss.collegeRank();
		ss.deptName();
		
		
		
		
	}

}
