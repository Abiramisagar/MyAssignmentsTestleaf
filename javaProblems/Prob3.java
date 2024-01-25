package javaProblems;

public class Prob3 {

	public static void main(String[] args) {
		
		String s= "A man, a plan, a canal:Panama", temp = "";
		char ch;
		s = s.replaceAll("\\s", "");
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		s = s.toLowerCase();
		int length = s.length();
		//System.out.println(s);
		
		for (int i = 0; i < length; i++) {
			
			ch = s.charAt(i);
			temp = ch+temp;
			System.out.println(temp);
		}
		if(temp.equals(s))
			System.out.println("The string is palindrome");
		else
			System.out.println("The string is not a palindrome");
	}

}
