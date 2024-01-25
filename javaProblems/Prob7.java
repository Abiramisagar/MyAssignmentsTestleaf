package javaProblems;

import java.util.Iterator;

public class Prob7 {

	public static void main(String[] args) {
		
		int[] arr = {2,1,3,2};
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			count = 0;
			for (int j = 0; j < arr.length; j++) {
				
				if(arr[i] == arr[j]) {
					count++;
					
				}
				
			}
			if(count >= 2) {						
				System.out.println(arr[i]);
				System.out.println("True");
				break;
			}
			
		}
		if(count < 2) {
			System.out.println("False");
		}
		

	}

}
