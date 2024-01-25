package javaProblems;

public class Prob10 {

	public static void main(String[] args) {
		
		String jewels = "z";
		String stones = "ZZ";
		int count = 0;
		
		for (int i = 0; i < jewels.length(); i++) {
			
			for (int j = 0; j < stones.length(); j++) {
				
				if(jewels.charAt(i) == stones.charAt(j)) {
					
					count++;
					
				}
				
			}			
		}
		if(count > 0) {
			System.out.println(count);
		}
		else
			System.out.println(count);

	}

}
