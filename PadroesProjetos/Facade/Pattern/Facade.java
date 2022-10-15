public class Facade {
    
    private Cliente cliente;
	private Pedido Pedido;

	public Facade() {
		this.cliente = new Cliente();
		this.pedido = new Pedido();
	}

	public void pedido(int preco, Cliente cliente, Pedido pedido){;
		System.out.printf("Nome do cliente: %s\n",quantidade, cliente.nomeCliente());
        System.out.printf("O número do pedido: %s\n", pedido.getpedido());
		System.out.printf("O preco do pedido é: R$ %s\n", preco);
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Pedido getpedido() {
		return pedido;
	}

	public void setpedido(Pedido pedido) {
		this.pedido = pedido;
	}
}
