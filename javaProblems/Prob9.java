package javaProblems;
public class Prob9 {

	public static void main(String[] args) {
		
		String s ="loveleetcode";
		int count = 0;		
		
		for (int i = 0; i < s.length(); i++) {
			count = 0;
			for (int j = 0; j < s.length(); j++) {
				
				if(s.charAt(i) == s.charAt(j)) {
					count++;								
				}
				
			}
			if(count == 1) {				
				System.out.println("Index of First non repeating character is "+i);
				break;
			}	
		}
		if(count > 1)
			System.out.println("-1");
		
	}

}
