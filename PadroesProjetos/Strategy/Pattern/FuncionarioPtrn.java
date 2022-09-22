package Pattern;

public class FuncionarioPtrn implements Inter{
	
	 private String departamento;
	    
	    public FuncionarioPtrn(String nome, int id, String departamento) {
	        this.departamento = departamento;
	    }

	    public String getDepartamento() { 
	    	return departamento; 
	    }
	    public void setDepartamento(String departamento) {
	        this.departamento = departamento;
	    }

	@Override
	public void salario() {
		System.out.println("O funcionário comum gera R$2.000 de lucro para a empresa");
		
	}

}
