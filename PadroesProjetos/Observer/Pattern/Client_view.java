package Observer;

public class Client_view implements Observer{
	
	public void sendMessage(String sms){
		
		display(sms);
		
	}
	
	public void display(String sms){
		
		System.out.println("Client view");
		System.out.println("Receiving message: " + sms);
	}

}
