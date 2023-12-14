package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range =12;
		int firstNum = 0;
		int secNum = 1;		
		int[] sum = new int[range];
		
		sum[0] = firstNum;
		sum[1] = secNum;
		System.out.println(sum[0]);
		System.out.println(sum[1]);
		
		for(int i =2; i<range ;i++) {
			sum[i] = firstNum + secNum;
			firstNum = secNum;
			secNum = sum[i];
			System.out.println(sum[i]);
		}
	}

}
