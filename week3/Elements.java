package week3.day1;

public class Elements {

	public static void main(String[] args) {
		
		CheckBoxButton chkBut = new CheckBoxButton();
		RadioButton raBut = new RadioButton();
		
		chkBut.click();
		chkBut.clickCheckButton();
		chkBut.submit();
		chkBut.setText("from Check box button");
		
		raBut.selectRadioButton();		

	}

}
