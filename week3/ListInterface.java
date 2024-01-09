package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {
		
		List<Integer> arr = new ArrayList<>(Arrays.asList(3,2,11,4,6,7));
		List<Integer> arr1 = new ArrayList<>(Arrays.asList(1,2,8,4,9,7));
		
		int size = arr.size();
		
		for (int i = 0; i < size; i++) {
			
			if(arr.get(i) == arr1.get(i)){
				
				System.out.println(arr.get(i));

			}		
			
	     }
	}

}
