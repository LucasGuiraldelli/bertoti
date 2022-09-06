package Observer;

public class Main {

	public static void main(String[] args) {
		
		Message message = new Message();
		Client client = new Client("Guira", "11 345674567");
		
		Ifood_view ifoodView = new Ifood_view();
		Client_view clientView = new Client_view();
		
		message.registerObserver(ifoodView);
		message.registerObserver(clientView);
		
		ifoodView.sendMessage("Client " + client.phone);
		clientView.sendMessage("Pizza Incoming...");
		
	}
}
