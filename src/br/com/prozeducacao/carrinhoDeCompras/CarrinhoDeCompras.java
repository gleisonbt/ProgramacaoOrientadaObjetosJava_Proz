package br.com.prozeducacao.carrinhoDeCompras;

public interface CarrinhoDeCompras {
	void adicionar(Produto p);
	int getQtdeProdutos();
	Produto[] getProdutos();
	String listarProdutos();
	boolean estaCheio();
	Produto buscarProdutoPOrNome(String nome);
}
