package Assignmentweek3.day2;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		String text = "Tes12Le79af65";
		int sum = 0;
		StringBuffer  num= new StringBuffer ();
		for (int i=0; i<text.length(); i++) {
			if(Character.isDigit(text.charAt(i))) {
	    		num.append(text.charAt(i));
//Now covert char to int using Character.getNumericValue() and add it to sum
	sum+=Character.getNumericValue(text.charAt(i));
		}	
			
		}
	System.out.println("The  Digits From String is"+num);	
	System.out.println("The Sum of Digits From String is"+sum);			
	}
}
