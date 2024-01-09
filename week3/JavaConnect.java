package week3.day1;

public class JavaConnect extends MySqlConnection{

	@Override
	public void connect() {
		
		System.out.println("connect : abstact class");
		
	}

	@Override
	public void disconnect() {
		
		System.out.println("disconnect : abstact class");
		
	}

	@Override
	public void executeUpdate() {
		
		System.out.println("execute update : abstact class");
		
	}
	
	public static void main(String[] args) {
		
		JavaConnect abs = new JavaConnect();
		abs.connect();
		abs.disconnect();
		abs.executeUpdate();
		abs.executeQuery();
		
		
	}
	
	

}
