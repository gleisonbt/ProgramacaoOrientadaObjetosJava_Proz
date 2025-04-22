package br.com.prozeducacao.carrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeComprasLista implements CarrinhoDeCompras {
	List<Produto> produtos = new ArrayList<Produto>();

	public void adicionar(Produto p) {
		produtos.add(p);
	}
	
	public int getQtdeProdutos() {
		return produtos.size();
	}
	
	public Produto[] getProdutos() {
		return (Produto[]) produtos.toArray();
	}
	
	public String listarProdutos() {
		String retorno = "";
		for (Produto produto : produtos) {
			retorno += produto.exibir() + "\n";
		}
		return retorno;
	}

	public boolean estaCheio() {
		return false;
	}
}
