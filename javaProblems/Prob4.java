package javaProblems;

import java.util.Arrays;
import java.util.Iterator;

public class Prob4 {

	public static void main(String[] args) {
		
		int[] nums = {4,1,2,1,2};
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		int length = nums.length;
		int count = 0;
		
		System.out.println("The length of an array is "+nums.length);
		
		for (int i = 0; i < length; i++) {
			count = 0;
			if(i != (length-1)){
				if(nums[i]==nums[i+1]){
					count = 1;
					i += 1;
					//System.out.println(nums[i]);
								
				}	
				
				if(count == 0) {
				System.out.println("The number which is not repeating : "+nums[i]);
				}
			}
			else{
				if(count == 0)
					System.out.println("The number which is not repeating : "+nums[i]);
			}
				
			}
			
		}
}
