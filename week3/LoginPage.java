package week3.day1;

public class LoginPage extends BasePage{
	
	public void performCommonTasks() {
		
		System.out.println("Perform the common tasks in Login Page");
	}
	
	public static void main(String[] args) {
		
		BasePage base = new BasePage();
		LoginPage login = new LoginPage();
		
		base.performCommonTasks();
		login.performCommonTasks();
		
		
	}

}
