package AntiPattern;

import Message;

public class Entregador {

	private String nome;
	private String placa;
	private String tempo_restante;

	public Entregador() {

	}

	public Entregador(String nome, String placa, String tempo_restante) {
		super();
		this.nome = nome;
		this.placa = placa;
		this.tempo_restante = tempo_restante;
	}

	public String getnome() {
		return nome;
	}

	public void setnome(String nome) {
		this.nome = nome;
	}

	public String getplaca() {
		return placa;
	}

	public void setplaca(String placa) {
		this.placa = placa;
	}

	public String gettempo_restante() {
		return tempo_restante;
	}

	public void settempo_restante(String tempo_restante) {
		this.tempo_restante = tempo_restante;
	}

	public void setInfo(String nome, String placa, String tempo_restante) {
		this.nome = nome;
		this.placa = placa;
		this.tempo_restante = tempo_restante;

		Notificadores.mandarNotificacao(nome, placa, tempo_restante);

	}

	@Override
	public String toString() {
		return "\nnome do entregador: " + nome + "\nPlaca: " + placa + "\nTempo restante: " + tempo_restante;
	}

}
