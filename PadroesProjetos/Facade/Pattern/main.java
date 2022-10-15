public class main {

    public static void main(String[] args) {

		Cliente cliente = new Cliente("Lucas");
		Pedido numeroPedido = new Pedido("123");

		Facade facade = new Facade();
		facade.pedido(cliente, numeroPedido);
	}
    
}
