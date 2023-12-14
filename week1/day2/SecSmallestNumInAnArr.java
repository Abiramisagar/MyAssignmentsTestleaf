package week1.day2;

import java.util.Arrays;

public class SecSmallestNumInAnArr {

	public static void main(String[] args) {
		
		int[] ary = {23, 45, 67, 32, 89, 22};
		
		Arrays.sort(ary);
		
		System.out.println("The second smallest number in an array is " +ary[1]);

	}

}
