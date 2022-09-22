package Observer;
import java.util.ArrayList;


public class Message implements Subject{
	
	private ArrayList observers;
	private Client c;
	
	public Message(){
		observers = new ArrayList();
	}
	
	public void registerObserver(Observer o){
		observers.add(o);
	}
	
	public void removeObserver(Observer o){
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	
	public void notifyObservers(String sms){
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.sendMessage(sms);
		}
	}
	
	public String enviarNotificacao(Client c, String n){
		notifyObservers(c.phone);
		return n;
	}

}
