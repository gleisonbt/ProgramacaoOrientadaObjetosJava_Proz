package br.com.prozeducacao.carrinhoDeCompras;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		/*Produto p = new Produto();
		p.setNome("camiseta");
		p.setPreco(30);
		/*System.out.println(p.getNome());
		System.out.println(p.getPreco());
		System.out.println(p.exibir());
		Produto p2 = new Produto();
		p2.setNome("calca");
		p2.setPreco(50);
		
		CarrinhoDeCompras cp = new CarrinhoDeCompras();
		cp.adicionar(p);
		cp.adicionar(p2);
		
		System.out.println(cp.listarProdutos());
		*/
		/*CarrinhoDeCompras cp = new CarrinhoDeComprasArray();
		
		String nome  = JOptionPane.
				showInputDialog(cp.getQtdeProdutos() + 1 + 
						"º Produto\nNome: ");
		while (!nome.equals("") &&
				cp.getQtdeProdutos() < cp.getProdutos().length) {
			Produto p = new Produto(nome, Float.parseFloat(
					JOptionPane.showInputDialog("Preço: ")));
			/*p.setNome(nome);
			p.setPreco(Float.parseFloat(JOptionPane.
					showInputDialog("Preço: ")));
			cp.adicionar(p);
			if (cp.getQtdeProdutos() < cp.getProdutos().length) {
				nome = JOptionPane.showInputDialog(cp.getQtdeProdutos() + 1 + 
						"º Produto\nNome: ");
			}
		}
		
		JOptionPane.showMessageDialog(null, cp.listarProdutos());
		*/
		/*Produto p  = new Produto("calça", 30);
		System.out.println(p.exibir());
		p.setPreco(40);
		System.out.println(p.exibir());
		*/
		CarrinhoDeCompras cp = new CarrinhoDeComprasArray();
		int opcao;
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(""
					+ "1 - adicionar produto\n"
					+ "2 - listar produtos\n"
					+ "3 - alterar produto\n"
					+ "4 - sair"));
			switch (opcao) {
			case 1:
				if (!cp.estaCheio()) {
					Produto p = new Produto(
							JOptionPane.showInputDialog("Nome: "),
							Float.parseFloat(
									JOptionPane.showInputDialog("Preço: ")));
					cp.adicionar(p);
				} else {
					JOptionPane.showMessageDialog(null, 
							"Carrinho cheio!");
				}
				
				break;
			
			case 2:
				JOptionPane.showMessageDialog(null, 
						cp.listarProdutos());
				break;
				
			case 3:
				
				break;
			
			case 4:
				
				break;
			default:
				JOptionPane.showMessageDialog(null, ""
						+ "Opção Inválida!");
				break;
			}
		} while (opcao != 4);
	}

}
