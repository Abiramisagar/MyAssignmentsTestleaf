package week3.day2;

import java.util.Iterator;

public class StringManipulation {

	private static char[] charArray;

	public static void main(String[] args) {
		
		String test = "changeme";
		
		char[] charArray= test.toCharArray();
		
		for (int i = charArray.length; i >= 0; i--) {
			
			if(i%2 == 1) {
				
				charArray[i] = Character.toUpperCase(charArray[i]);
													
		    }						
		}

		System.out.println(charArray);
	}

}
