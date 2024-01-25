package javaProblems;

import java.util.Iterator;

public class Prob6 {

	public static void main(String[] args) {
		int[] nums = { 3,2,3};
		int majority = 1;
		int index = -1;
		int length = nums.length;
				
		for (int i = 0; i < length; i++) {
			
			int count = 0;
			for (int j = 0; j < length; j++) {
				
				if(nums[i] == nums[j]) {
					count ++;
				
				}
						
			}
			if(count > majority) {
				
				majority = count;
				index = i;
				if(majority > (length/2)) {					
					System.out.println("The Majority Element is " +nums[index]);
					break;
				}
				
			}
			
		}
		 
		if(majority <= (length/2))
			System.out.println("No Majority Element");
			
	}
}


