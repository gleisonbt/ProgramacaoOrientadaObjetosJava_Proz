package br.com.prozeducacao.carrinhoDeCompras;

public class Produto {
	//Todo atributo DEVE ser privado
	private String nome;
	private float preco;
	
	
	public Produto(String nome, float preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	//Método para alterar ou inserir valor
	void setNome(String nome) {
		//this é para acessar os atributos
		this.nome = nome;
	}
	
	//Método para retornar valor
	//Sempre retorna uma valor com o tipo do atributo
	String getNome() {
		return this.nome;
	}
	
	void setPreco(float preco) {
		this.preco = preco;
	}
	
	float getPreco() {
		return this.preco;
	}
	
	
	String exibir() {
		return nome + " - " + preco;
	}
}
