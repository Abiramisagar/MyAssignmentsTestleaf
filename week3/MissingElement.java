package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElement {
	
	public static void main(String[] args) {
		
		List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,10,6,8));
		
		
		Collections.sort(arr);
		System.out.println(arr.size());
		
		
		for (int i = 0; i < (arr.size()-1); i++) {
			
			if((arr.get(i)+1) != arr.get(i+1)){
				
				System.out.println(" The missing number is "+(arr.get(i)+1));
			}
			
		}
	}

}
