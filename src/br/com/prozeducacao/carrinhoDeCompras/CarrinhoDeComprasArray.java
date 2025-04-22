package br.com.prozeducacao.carrinhoDeCompras;

import javax.swing.JOptionPane;

public class CarrinhoDeComprasArray implements CarrinhoDeCompras {
	//Instanciando a classe Array
	private Produto[] produtos = new Produto[3];
	int qtdeProdutos = 0;
	
	
	
	public void adicionar(Produto p) {
		if (qtdeProdutos < produtos.length) {
			produtos[qtdeProdutos] = p;
			qtdeProdutos++;
		} else {
			JOptionPane.showMessageDialog(null, 
					"Carrinho Cheio!");
		}
		
	}
	
	public Produto[] getProdutos() {
		return produtos;
	}


	public int getQtdeProdutos() {
		return qtdeProdutos;
	}

	public String listarProdutos() {
		String retorno = "";
		for (int i = 0; i < qtdeProdutos; i++) {
			retorno += produtos[i].exibir() + "\n";
		}
		return retorno;
	}
	
	public boolean estaCheio() {
		return qtdeProdutos == produtos.length;
	}
}
