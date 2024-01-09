package week3.day1;

public class APIClass {
	
	public void sendRequest(String endPoint) {
		
		System.out.println(endPoint);
	}
	
	public void sendRequest(String endPoint, String requestBody, String requestStatus) {
		
		System.out.println(endPoint);
		System.out.println(requestBody);
		System.out.println(requestStatus);		
	}
	
	public static void main(String[] args) {
		
		APIClass api = new APIClass();
		
		String endPoint = new String("End Point");
		String requestBody = new String("Request Body");
		String requestStatus = new String("Request Status");	
		
		api.sendRequest(endPoint);
		api.sendRequest(endPoint, requestBody, requestStatus);
	}
	
	

}
