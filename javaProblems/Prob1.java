package javaProblems;

/*
 * Given a string s consisting of words and spaces,
 * return the length of the last word in the string.
 * A word is a maximal substring consisting of non-space 
 *  characters only. 
 */
public class Prob1 {

	public static void main(String[] args) {
		
		String s = "Hello World";
		String[] split = s.split(" ");
		
		int length = split.length;
		
					
		System.out.println("The Last Word is "+split[length-1]);
		
		System.out.println("with length "+split[length-1].length());			
		
	}

}
