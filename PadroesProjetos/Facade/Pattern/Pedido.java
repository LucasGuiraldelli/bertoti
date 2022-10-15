public class Pedido {

    private String numPed;
	private int preco;

	public int fazerpedido(int numPed){
		System.out.println("Pedido saindo do forno...");
		return this.setpreco(this.getpreco() + valor);
	}

	public String numPed(){
		System.out.println("Numero do pedido: ");
		return this.numPed;
	}

	public int obterpreco(){
		System.out.println("Preco: ");
		return this.getpreco();
	}

	public int getpreco() {
		return preco;
	}

	public int setpreco(int preco) {
		this.preco = preco;
		return preco;
	}
    
}
