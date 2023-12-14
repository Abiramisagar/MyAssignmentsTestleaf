package week1.day2;

public class PrimeNumber {
	public static void main(String[] args) {
		int number = 13;
		boolean pri = false;
		
		for (int i = 2; i < number/2; i++) {		
			if(number%i == 0){
				pri = true;
				break;
			}
			
		}
		
		if(pri == true) {
			System.out.println("The number is  not prime");
		}
		else {
			System.out.println("The number is prime");
		}
	}

}
