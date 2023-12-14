package week1.day2;

public class Palindrome {
	
	public static void main(String[] args) {
		
		int num = 34343;
		int temp = 0;
		
		for (int i = num; i != 0; i /= 10) {
			
		int digit = i % 10;	
		temp = temp * 10 + digit;
		}
		
		if(num == temp) {
		System.out.println("The number is Palindrome ");
		}
		else {
		System.out.println("The number is not a Palindrome");
	}
	}
}
