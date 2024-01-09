package week3.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		String words[] = text.split(" ");
		StringBuffer str = new StringBuffer();
		int count=0;
		
		for (int i = 0; i < words.length; i++) {					
			
			for (int j = i+1; j <= (words.length-1); j++) {
			
				if(words[i].equals(words[j])) {								
					
						count++;
						if(count == 1) {													  
							words[j] = " ";
						}					
				    }
				count =0;
				}
			if(i != 0)
			str.append(" ");
			str.append(words[i]);
			}	
		System.out.println(str);
	}
}
