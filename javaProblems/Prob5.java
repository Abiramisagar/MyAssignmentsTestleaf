package javaProblems;

import java.util.ArrayList;
import java.util.List;

public class Prob5 {

	public static void main(String[] args) {
		
		int num = 72;
		int i = 0, count = 20;
		
		List<Integer> arr = new ArrayList<Integer>();
		
	
		for (int j = 0; j < count; j++) {
	
		while(num > 0){
			
			arr.add(num%10);
			num = num/10;
		}
			
		for (i = 0; i < (arr.size()); i++) {
			
			arr.set(i, (arr.get(i)*arr.get(i)));
			//System.out.println("Squared number "+arr);
			num += arr.get(i);
			//System.out.println("Another added number "+num);
		}
		arr.clear();
		count--;
		}
		if(num == 1)
			System.out.println("The number is happy number");
			
		if(num != 1)
			System.out.println("The number is not a happy number");
	
	}
}
