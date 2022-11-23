package application;

import Cashier;
import BankManager;

public class Main {

	public static void main(String[] args) {
		Cashier Cashier = new Cashier("Lucas", "Cashier");
		BankManager manager = new BankManager("José", "manager");
		manager.add(Cashier);
		Cashier.add(manager);
		System.out.println(manager.getNome());
	}

}
