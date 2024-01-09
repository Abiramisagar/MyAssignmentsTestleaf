package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SecLargestNum {
	
	public static void main(String[] args) {
		
		List<Integer> arr = new ArrayList<>(Arrays.asList(3,2,11,4,6,7));
		System.out.println(arr);
		
		Collections.sort(arr);
		System.out.println("Sorted List "+arr);
		
		int size = arr.size();
		System.out.println("Size of List is "+size);
		
		System.out.println("The second Largest number from List is "+arr.get(size-2));
				
	}

}
