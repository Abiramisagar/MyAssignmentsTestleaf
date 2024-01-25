package javaProblems;

public class Prob2 {

	public static void main(String[] args) {
		
		int x = 20;
		
		for (int i = 1; i < x; i++) {
			
			int p = i*i;
			if(p == x) {
				System.out.println("The square root of x is "+i);
				break;
			}
			else {
				if(p>x){
				System.out.println("The square root of x is "+(i-1));
				break;
				}
			}
				
			
		}
		

	}

}
