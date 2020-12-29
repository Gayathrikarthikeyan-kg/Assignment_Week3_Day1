package Assignmentweek3.day2;

public class Palindrome {

	public static void main(String[] args) {
		String str="MADAm";
		String rev="";
		char[]CharacterArray=str.toCharArray();
		for(int i=CharacterArray.length-1;i>=0;i--)
		{
			rev=rev+CharacterArray[i];
			
		}
		if(rev.equalsIgnoreCase(str))
		{
			System.out.println("The given Word is Palindrome");
		}
		else
		{
			System.out.println("The given word is not palindrome");
		}
	}

}
