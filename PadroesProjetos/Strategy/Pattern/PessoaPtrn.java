package Pattern;

public class PessoaPtrn{
	
	private Inter inter;
	
	private String nome;
    private int id;
    
	public PessoaPtrn(Inter salario, String nome, int id) {
		this.inter = salario;
		this.nome = nome;
		this.id = id;
	}

	public PessoaPtrn() {
		// TODO Auto-generated constructor stub
	}

	public Inter getInter() {
		return inter;
	}

	public void setInter(Inter inter) {
		this.inter = inter;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public void salario() {
		this.inter.salario();
		
	}

}
