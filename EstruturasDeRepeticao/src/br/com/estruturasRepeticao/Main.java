package br.com.estruturasRepeticao;

import javax.swing.JOptionPane;


public class Main {
	 
	static void whileLoop(int valor) {
		int cont = 0;
		String contagem = "";
		while (cont < valor) {
			/*
			 * contagem = contagem + (cont + " ");
			 * cont = cont + 1;
			 */
			contagem += 1 + cont++ + " ";
		}
		JOptionPane.showMessageDialog(null, contagem);
	}

	static void doWhileLoop(int valor) {
		int cont  = 0;
		String contagem = "";
		do {
			contagem += 1 + cont++ + " ";
		} while (cont < valor);
		JOptionPane.showMessageDialog(null, contagem);
	}

	static void forLoop(int valor) {
		String contagem = "";
		for (int cont = 0; cont < valor; cont++) {
			contagem += 1 + cont + " ";
		}
		JOptionPane.showMessageDialog(null, contagem);
	}

	public static void main(String[] args) {
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Vamos contar de um a: "));
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe a opcao de loop desejada:"
				+ "\n1 - While\n2 - DoWhile\n3 - For"));
		
		switch (opcao) {
		case 1: {
			whileLoop(valor);
			break;
		}
		case 2: {
			doWhileLoop(valor);
			break;
		}
		case 3: {
			forLoop(valor);
			break;
		}
		default:
			JOptionPane.showMessageDialog(null, "Opção Inválida!");
		}

	}
}
