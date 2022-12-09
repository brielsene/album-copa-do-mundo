package br.com.album.copa.modelo;

public class Figurinha {
	private String nome, selecao;
	private int numero;
	
	
	public Figurinha(String nome, String selecao, int numero) {
		this.nome = nome;
		this.numero = numero;
		this.selecao = selecao;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public String getSelecao() {
		return selecao;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Nome: "+this.nome +", Numero: "+this.nome+", Seleção: "+this.selecao+"]";
	}

}
