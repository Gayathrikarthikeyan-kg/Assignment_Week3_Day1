package Assignmentweek3.day2;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		int count = 0;
		char[] CharacterArray = str.toCharArray();
		System.out.println("The Array length is " + str.length());
		// Arrays.sort(CharacterArray);
		for (int i = 0; i < CharacterArray.length; i++) {
			if (CharacterArray[i]=='e') {

				count++;
			}
			
			
		}
		System.out.println("The Count is " + count);
	}

}
