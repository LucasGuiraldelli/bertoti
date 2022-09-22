package Observer;

public class Ifood_view implements Observer{
	
	public void sendMessage(String sms){
		
		display(sms);
		
	}
	
	public void display(String sms){
		
		System.out.println("Ifood");
		System.out.println("Sending: " + sms);
	}

}
