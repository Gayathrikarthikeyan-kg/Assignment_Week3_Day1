package Assignmentweek3.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "stops";
		String text2 = "potss"; 
		// Check length of the strings are same then (Use A Condition)
		int t1= text1.length();
		int t2=text2.length();
		//Convert both Strings in to characters
		char[]CharacterArray=text1.toCharArray();
		char[]CharacterArray1=text2.toCharArray();
		// Sort Both the arrays

		Arrays.sort(CharacterArray);
		Arrays.sort(CharacterArray1);
		
		//  Check both the arrays has same value
		if(t1==t2)
        {
        	System.out.println("The Given String has Same Value");
        }

      else
      {
    	 System.out.println("The Givenn String Doesnot have same Value"); 
      }
	}
	}

