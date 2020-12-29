package Assignmentweek3.day2;

public class FindTypes {
	public static void main(String[] args) {
	String test = "$$ Welcome to 2nd Class of Automation $$ ";
	//int  letter = 0, space = 0, num = 0, specialChar = 0;

    StringBuffer alpha = new StringBuffer(),  
    num = new StringBuffer(), special = new StringBuffer(); 
    for (int i=0; i<test.length(); i++) {
    	if(Character.isDigit(test.charAt(i))) {
    		num.append(test.charAt(i));}
    		else if(Character.isAlphabetic(test.charAt(i))) {
    		alpha.append(test.charAt(i));
    		}
    		else {
    			special.append(test.charAt(i));
    	}	
    }
    System.out.println("letter: " + alpha);
	//System.out.println("space: " + space);
	System.out.println("number: " + num);
	System.out.println("specialCharcter: " + special);
	}
}
	
		 
		/*
		 * String test = "$$ Welcome to 2nd Class of Automation $$ "; int letter = 0,
		 * space = 0, num = 0, specialChar = 0; char[] CharacterArray =
		 * str.toCharArray(); for (int i = 0; i < CharacterArray.length; i++) { if() }
		 */
	/*
	 * String test = "$$ Welcome to 2nd Class of Automation $$ "; for (String
	 * retval: test.split(" ")) {
	 * 
	 * System.out.println(retval);
	 */


	

