package org.system;

public class Students {
	public void	getStudentInfo() {
		System.out.println("The Student Results are...");
		
	}
	public void	getStudentInfo(int id) {
		System.out.println(" The Id is ..");
		
	}
	public void	getStudentInfo(int id,String name) {
		System.out.println(" The Id is"+id + "The Name is "+name);
		
	}
	public void	getStudentInfo( String email ,int phoneNumber)
	{
		System.out.println("The Email is "+email+"The PhoneNumber is "+phoneNumber);
		
	}
	public static void main(String[] args) {
		Students ss= new Students();
		ss.getStudentInfo();
		ss.getStudentInfo(719);
		ss.getStudentInfo(719,"Bala");
		ss.getStudentInfo("Bala@gmail.com", 923456789);
		
	    
	}

}
