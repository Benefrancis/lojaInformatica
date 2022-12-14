package br.com.fiap.shift.loja.model;

public class Cidade {

	private String nome;

	private Estado estado;

	public Cidade() {
	}

	public Cidade(String nome, Estado estado) {
		this.nome = nome;
		this.estado = estado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String toString() {
		return nome;
	}

}
