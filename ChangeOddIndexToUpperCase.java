package Assignmentweek3.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		 String test = "changeme";
		  String returnVal = new String();
		 char[]CharacterArray=test.toCharArray();
		 //Traverse through each character (using loop)
		 for(int i=0;i<=test.length()-1; i=i+2)
			 
		 {
			 returnVal += CharacterArray[i] ;
			// System.out.println(Character.toString((char) (CharacterArray[i]-32)));
	
		 
	String	Alpha= returnVal.toUpperCase();
			System.out.println("The value is "+Alpha);
		 }
		 

	}

}
