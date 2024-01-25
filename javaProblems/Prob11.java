package javaProblems;

public class Prob11 {

	public static void main(String[] args) {
		
		String str = "abccbaacz";
		int diff = 0, index1, index2, temp = 0;
		
		for (int i = 0; i < str.length(); i++) {
			
			for (int j = i+1; j < str.length(); j++) {
				
				if(str.charAt(i) == str.charAt(j)) {
					if(i != j) {												
						diff = j - i;
						
						if(temp > diff ) {
							temp = diff;
							index1 = i;
							index2 = j;
							System.out.println(temp);
							System.out.println(index1);
							System.out.println(index2); 
							
						}
						
						
					}
					
				}
				
			}
			
			
		}

	}

}
